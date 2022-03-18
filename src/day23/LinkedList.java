package day23;

public class LinkedList implements List {
    int size;
    Node head;

    public LinkedList() {

    }

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int get(int index) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (index == i) {
                return node.val;
            }
            node = node.next;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    @Override
    public void add(int val) {
        if (size() == 0) {
            head = new Node(val);
            size++;
        } else {
            Node end = head;
            while (end.next != null) {
                end = end.next;
            }
            end.next = new Node(val);
            size++;
        }
    }

    @Override
    public void add(int index, int val) {
        if (index > size() || index < 0) {
            throw new IndexOutOfBoundException("Index out of bounds");
        }
        if (index == size) {
            add(val);
        } else if (index == 0) {
            Node start = new Node(val);
            Node end = head;
            head = start;
            head.next = end;
            size++;
        } else {
            Node change = new Node(val);
            size++;
            Node start = head;
            Node end;
            for (int i = 0; i < index - 1; i++) {
                start = start.next;
            }
            end = start.next;
            start.next = change;
            change.next = end;
        }

    }

    @Override
    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            size--;
        } else {
            Node start = head;
            Node end;
            for (int i = 0; i < index - 1; i++) {
                start = start.next;
            }
            end = start.next;
            end = end.next;
            start.next = end;
            size--;
        }
    }

    @Override
    public String toString() {
        String ret;
        Node start = head;
        StringBuilder retBuilder = new StringBuilder("[");
        while (start != null) {
            retBuilder.append(start.val);
            retBuilder.append("->");
            start = start.next;
        }
        ret = retBuilder.toString();
        ret += ("null]");
        return ret;
    }
}