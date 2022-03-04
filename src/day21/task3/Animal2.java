package day21.task3;

public class Animal2 {
    protected int age;
    protected String name;

    public Animal2(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}
