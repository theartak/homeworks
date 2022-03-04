package day20.task1;

public abstract class Shape {
    protected double radius;

    public Shape() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //    protected void getArea(double radius) {
//        System.out.println("This method does nothing");
//    }
//
//    protected void getPerimeter(double radius) {
//        System.out.println("This method also does nothing");
//    }

    public double calculateArea(double getRadius) {
        return 0;
    }

    public void getArea() {
        System.out.println("This method does nothing yet");
    }

    public double calculatePerimeter(double getRadius) {
        return 0;
    }

    public void getPerimeter() {
        System.out.println("This method also does nothing yet");
    }
}
