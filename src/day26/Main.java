package day26;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
     * Task 4
     * A method that copies the elements of a source into a destination.
     */
    public static void copyElements(List<Number> num, List<? extends Number> list) {
        num.clear();
        num.addAll(list);
    }
}
