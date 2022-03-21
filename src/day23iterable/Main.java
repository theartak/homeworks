package day23iterable;

public class Main {
    public static void main(String[] args) {
        arrayListMethod();
    }

    public static void linkedListMethod() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList.toString());
        linkedList.add(0, 2);
        System.out.println(linkedList.toString());
        linkedList.add(3, 5);
        System.out.println(linkedList.toString());
        linkedList.delete(0);
        System.out.println(linkedList.toString());
        linkedList.delete(2);
        System.out.println(linkedList.toString());
        linkedList.delete(3);
        System.out.println(linkedList.toString());
    }

    public static void arrayListMethod() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(1, 10);
        arrayList.delete(1);

        for (int x : arrayList) {
            System.out.println(x);
        }
    }
}
