package carengine;

public final class Car {
    private int year;
    private String model;
    private String mark;
    private final Engine engine = new Engine(200, 50000, 150);

    public Car(int year, String model, String mark) {
        this.year = year;
        this.model = model;
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Engine getEngine() {
        return engine;
    }

    public void printCar() {
        System.out.print("Year: " + getYear() + ", Model: " + getModel() + ", Mark: " + getMark() +
                ", Engine specs: " + engine.returnEngine() + "\n");
    }
}
