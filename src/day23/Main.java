package day23;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.toString());
        list.add(0, 2);
        System.out.println(list.toString());
        list.add(3,5);
        System.out.println(list.toString());
        list.delete(0);
        System.out.println(list.toString());
        list.delete(2);
        System.out.println(list.toString());
        list.delete(3);
        System.out.println(list.toString());
    }
}
