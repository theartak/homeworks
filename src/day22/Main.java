package day22;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        defaultStackClassPop();
    }

    /**
     * Task 1
     */

    public static void userInput() {
        boolean match = false;
        System.out.print("Input string: ");
        while (!match) {
            try {
                String input = sc.nextLine();
                System.out.println(Integer.parseInt(input) + " is a correct input");
                match = true;
            } catch (NumberFormatException e) {
                System.out.print("Wrong input, please try again: ");
            }
        }
    }

    /**
     * Task 2
     */
    //Push example
    public static void defaultStackClassPush() {
        DefaultStack d = new DefaultStack();
        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);
        d.push(5);
        d.push(6);
    }

    //Pop example
    public static void defaultStackClassPop() {
        DefaultStack d = new DefaultStack();
        System.out.println(d.pop());
    }
}
