package carengine;

import java.util.Objects;

public class Car {
    private String model;
    private int year;
    private String color;
    private Engine engine;

    public Car(String model, int year, String color, Engine engine) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = hash * 31 + year;
//        hash = hash * 31 + ((model == null) ? 0 : model.hashCode());
//        hash = hash * 31 + ((engine == null) ? 0 : engine.hashCode());
//        return hash;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(year, model, engine);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Car other = (Car) o;

        return other.year == this.year &&
                Objects.equals(this.model, other.model) &&
                Objects.equals(this.engine, other.engine);
    }
}
