package codetest.task8;

import java.util.Objects;

public class Car {
    private String model;
    private int year;
    private String color;

    public static class Weight extends Car {
        private int weight;

        public Weight() {
        }

        public Weight(String model, int year, String color, int weight) {
            super(model, year, color);
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public int hashCode() {
            int hash = super.hashCode();
            hash = hash * 11 + weight;
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || o.getClass() != this.getClass()) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            Weight w = (Weight) o;
            return this.weight == w.weight;
        }

    }

    public Car() {

    }

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
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

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return this.year == car.year &&
                Objects.equals(this.model, car.model);
    }
}
