package testing;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

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
        map.put(1, "One");
        map.put(3, "Three");
        map.put(2, "Two");
        System.out.println(map);
    }
}
