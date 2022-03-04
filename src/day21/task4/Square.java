package day21.task4;

public class Square implements Shape {
    protected double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return getA() * getA();
    }

    @Override
    public double perimeter() {
        return 4 * getA();
    }
}
