package day20;

import day20.task1.*;
import day20.task2.*;
import day20.task3.*;
import day20.task4.*;
import day20.task5.*;

public class Main {
    public static void main(String[] args) {
        swordsmanClass();
    }

    public static void circleClass() {
        Circle c = new Circle();
        c.setRadius(5);
        c.calculateArea(c.getRadius());
        c.getArea();
        c.calculatePerimeter(c.getRadius());
        c.getPerimeter();
    }

    public static void squareClass() {
        Square s = new Square();
        s.setRadius(5);
        s.calculateArea(s.getRadius());
        s.getArea();
        s.calculatePerimeter(s.getRadius());
        s.getPerimeter();
    }

    public static void programmingClass() {
        ProgrammingLanguage p = new ProgrammingLanguage();
        System.out.println(p.getName());
    }

    public static void englishClass() {
        EnglishLanguage e = new EnglishLanguage();
        System.out.println(e.getName());
    }

    public static void birdClass() {
        Bird b = new Bird();
        System.out.println(b.isFlyable());
    }

    public static void planeClass() {
        Plane p = new Plane();
        System.out.println(p.isFlyable());
    }

    //Optional
    public static void carClass() {
        Car c = new Car();
        System.out.println(c.isFlyable());
    }

    public static void shooterClass() {
        Shooter s = new Shooter();
        s.setName("Jack");
        s.setType("Shooter");
        s.setPower("Low");
        s.setHealth(100);
        s.hit();
    }

    public static void swordsmanClass() {
        Swordsman sw = new Swordsman();
        sw.setName("Mike");
        sw.setType("Swordsman");
        sw.setPower("High");
        sw.setHealth(150);
        sw.hit();
    }
}
