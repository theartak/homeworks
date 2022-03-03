package Day19Homework.Day19Task1;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog food");
    }
}