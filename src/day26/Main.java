package day26;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        comparatorClass();
    }

    /**
     * Task 1
     * A method that takes a list of any type and prints its elements.
     */
    public static <T> void printElements(List<T> list) {
        for (T i : list) {
            System.out.println(i);
        }
    }

    /**
     * Task 2
     * A method that takes an array of T type and converts it to a list.
     */
    public static <T> List<T> convertToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    /**
     * Task 3
     * A method that takes a list of T type and comparator of T type
     * and returns the largest value.
     */
    public static <T> T max(List<T> list, Comparator<T> comp) {
        return Collections.max(list, comp);
    }

    public static void comparatorClass() {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("ABC");
        stringList.add("ABCDEFG");
        stringList.add("BCD");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);


        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {

                if (str2.length() < str1.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a > b) {
                    return 1;
                }
                return 0;
            }
        };

        System.out.println(max(stringList, stringComparator));
        System.out.println(max(integerList, integerComparator));
    }

    /**
     * Task 4
     * A method that copies the elements of a source into a destination.
     */
    public static void copyElements(List<Number> num, List<? extends Number> list) {
        num.clear();
        num.addAll(list);
    }

    public static void copyElementsClass() {
        List<Number> num = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        num.add(1);
        num.add(2);
        list.add(1);
        list.add(3);
        System.out.println("Number: " + num);
        System.out.println("List: " + list);
        copyElements(num, list);
        System.out.println("Number: " + num);
        System.out.println("List: " + list);
    }

    /**
     * Task 5
     * Create a Pair interface with 2 generic types and with methods getKey(),
     * getValue(). Create DefaultPair class with 2 generic types which
     * implements the Pair interface. DefaultPair has following fields - key, value.
     */
    public static void pairClass() {
        DefaultPair<Integer, String> pair = new DefaultPair<>(10, "G");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
