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
        copy(num, list);
        System.out.println("Number: " + num);
        System.out.println("List: " + list);
    }

    //Task1
    public static <T> void print(List<T> list) {
        for (T i : list) {
            System.out.println(i);
        }
    }

    //Task2
    public static <T> List<T> convert(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    //Task4
    public static void copy(List<Number> num, List<? extends Number> list) {
        num.clear();
        num.addAll(list);
    }
}