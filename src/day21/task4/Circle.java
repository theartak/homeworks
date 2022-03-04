package day21.task4;

public class Circle implements Shape {
    protected double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return Math.PI * getA() * getA();
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getA();
    }
}
