package carengine;

import java.util.Objects;

public class Engine {
    private int hp;
    private int mileage;
    private int weight;

    public Engine(int hp, int mileage, int weight) {
        this.hp = hp;
        this.mileage = mileage;
        this.weight = weight;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = hash * 31 + hp;
//        hash = hash * 31 + mileage;
//        hash = hash * 31 + weight;
//        return hash;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, mileage, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Engine e = (Engine) o;
        return this.hp == e.hp && this.mileage == e.mileage && this.weight == e.weight;
    }
}
