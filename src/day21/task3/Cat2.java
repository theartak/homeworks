package day21.task3;

public class Cat2 extends Animal2 {

    @Override
    public void sound() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}
