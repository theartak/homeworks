package codetest;

import codetest.task8.*;
import codetest.task9.*;

public class Main {
    public static void main(String[] args) {
        animalClass();
    }

    public static void carClass(){
        Car c1 = new Car("Opel", 1997, "red");
        Car c2 = new Car("Opel", 1997, "pink");
        Car.Weight innerWeight1 = new Car.Weight("Opel", 1997, "pink", 250);
        Car.Weight innerWeight2 = new Car.Weight("Opel", 1997, "pink", 250);
        System.out.println(c1.equals(c2));
        System.out.println("c1 hashcode: " + c1.hashCode() + ", c2 hashcode: " + c2.hashCode());
        System.out.println(innerWeight1.equals(innerWeight2));
        System.out.println("Weight 1 hashcode: " + innerWeight1.hashCode() +
                ", Weight 2 hashcode: " + innerWeight2.hashCode());
    }

    public static void animalClass(){
        Dog d = new Dog();
        Wolf w = new Wolf();
        Eagle e = new Eagle();
        System.out.println("Dog");
        System.out.println();
        System.out.print("Bark: " + d.bark() + "\nRun: " + d.run() + "\nFly: " + d.fly() + "\nEat: " + d.eat() + "\n");
        System.out.println();
        System.out.println("Wolf");
        System.out.println();
        System.out.print("Bark: " + w.bark() + "\nRun: " + w.run() + "\nFly: " + w.fly() + "\nEat: " + w.eat() + "\n");
        System.out.println();
        System.out.println("Eagle");
        System.out.println();
        System.out.print("Bark: " + e.bark() + "\nRun: " + e.run() + "\nFly: " + e.fly() + "\nEat: " + e.eat());
    }
}
