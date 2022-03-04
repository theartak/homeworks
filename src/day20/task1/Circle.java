package day20.task1;

public class Circle extends Shape {
//    @Override
//    protected void getArea(double radius){
//        System.out.println("The area of the circle equals: " + (Math.PI * radius * radius));
//    }
//
//    @Override
//    protected void getPerimeter(double radius){
//        System.out.println("The perimeter of the circle equals: " + (2 * Math.PI * radius));
//    }

    @Override
    public double calculateArea(double getRadius) {
        return Math.PI * getRadius * getRadius;
    }

    @Override
    public void getArea() {
        System.out.println(calculateArea(getRadius()));
    }

    @Override
    public double calculatePerimeter(double getRadius) {
        return 2 * Math.PI * getRadius;
    }

    @Override
    public void getPerimeter() {
        System.out.println(calculatePerimeter(getRadius()));
    }
}
