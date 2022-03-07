package day21;

import day21.task1.*;
import day21.task2.*;
import day21.task3.*;
import day21.task4.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        shapeClass();
    }

    public static void animalClass() {
        Animal1 a = new Animal1();
        a.voice();
    }

    public static void catClass() {
        Cat1 c = new Cat1();
        c.voice();
    }

    public static void horseClass() {
        Horse1 h = new Horse1();
        h.voice();
    }

    public static void compileTimeClass() {
        ComptimePol c = new ComptimePol();
        c.method();
        c.method("Overloaded method");
    }

    public static void runtimePolOGClass() {
        RuntimePolOG r = new RuntimePolOG();
        r.method();
    }

    public static void runtimePolClass() {
        RuntimePol r = new RuntimePol();
        r.method();
    }

    public static void animalClass2() {
        Animal2 a = new Cat2();
        a.setName("Animal");
        a.setAge(10);
        a.sound();
        Cat2 c = new Cat2();
        c.setName("Cat");
        c.setAge(5);
        c.sound();
    }

    public static void shapeClass() {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        c.setA(4);
        r.setA(2);
        r.setB(4);
        s.setA(5);
        Shape[] arr = {c, r, s};
        for (Shape shape : arr) {
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
        }
    }
}
