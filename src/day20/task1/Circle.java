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
    public void getArea(double radius) {
        System.out.println("The area of the circle equals: " + (Math.PI * radius * radius));
    }

    @Override
    public void getPerimeter(double radius) {
        System.out.println("The perimeter of the circle equals: " + (2 * Math.PI * radius));
    }
}
