package day21.task4;

public class Rectangle implements Shape {
    protected double a;
    protected double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return getA() * getB();
    }

    public double perimeter() {
        return 2 * (getA() + getB());
    }
}
