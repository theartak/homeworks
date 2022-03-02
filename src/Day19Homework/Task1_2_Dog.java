package Day19Homework;

public class Task1_2_Dog extends Task1_1_Animal {
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog food");
    }
}