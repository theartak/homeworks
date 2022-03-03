package day20.task4;

public abstract class Warrior {
    protected String name;
    protected String type;
    protected String power;
    protected int health;

    public Warrior() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void hit() {
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Power: " + getPower());
        System.out.println("Health: " + getHealth());
    }
}
