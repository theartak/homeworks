package day20.task4;

public class Shooter extends Warrior {
    @Override
    public void hit() {
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Power: " + getPower());
        System.out.println("Health: " + getHealth());
    }
}
