package carengine;

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

    public String returnEngine() {
        return "Horsepower: " + getHp() + ", Mileage: " + getMileage() + ", Weight: " + getWeight();
    }
}
