package day21.task3;

public class Cat2 extends Animal2 {
    protected int age;
    protected String name;

    public Cat2(){

    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sound(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}
