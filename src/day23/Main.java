package day23;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.toString());
        list.add(0, 20);
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
