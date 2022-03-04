package day20.task1;

public class Square extends Shape {
//    @Override
//    protected void getArea(double radius) {
//        System.out.println("The are of the square equals: " + (radius * radius));
//    }
//
//    @Override
//    protected void getPerimeter(double radius) {
//        System.out.println("The perimeter of the square equals: " + (4 * radius));
//    }

    @Override
    public double calculateArea(double getRadius) {
        return getRadius * getRadius;
    }

    @Override
    public void getArea() {
        System.out.println(calculateArea(getRadius()));
    }

    @Override
    public double calculatePerimeter(double getRadius) {
        return 4 * getRadius;
    }

    @Override
    public void getPerimeter() {
        System.out.println(calculatePerimeter(getRadius()));
    }
}
