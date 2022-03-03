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
    public void getArea(double radius) {
        System.out.println("The are of the square equals: " + (radius * radius));
    }

    @Override
    public void getPerimeter(double radius) {
        System.out.println("The perimeter of the square equals: " + (4 * radius));
    }
}
