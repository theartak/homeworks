package testing;

import java.util.Scanner;
import java.util.TreeMap;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        treeMapStuff();
    }

    public static void classStuff(){
        Class i = Integer.class;
        String s = "class java.lang.String";
        Class c = s.getClass();
        System.out.println(i);
        System.out.println(s);
        System.out.println(c);
    }

    public static void treeMapStuff(){
        TreeMap<Integer, String> map = new TreeMap<>();
        System.out.print("Input key 1: ");
        map.put(1, sc.nextLine());
        System.out.print("Input key 3: ");
        map.put(3, sc.nextLine());
        System.out.print("Input key 2: ");
        map.put(2, sc.nextLine());
        System.out.println(map);
    }
}
