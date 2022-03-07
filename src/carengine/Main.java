package carengine;

public class Main {
    public static void main(String[] args) {
        //Engine e = new Engine(200, 50000, 150);
        Car c = new Car(2004, "M3", "BMW");
        c.printCar();
        c.getEngine().setHp(300);
        c.getEngine().setMileage(20000);
        c.getEngine().setWeight(100);
        c.printCar();
    }
}
