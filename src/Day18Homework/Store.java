package Day18Homework;

import java.util.Arrays;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int[] products;

    public Store() {

    }

    public Store(int countOfWorkers, String name, String phoneNumber, int[] products) {
        this.setCountOfWorkers(countOfWorkers);
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setProducts(products);
    }

    public String getCountOfWorkers() {
        if (countOfWorkers < 3 || countOfWorkers > 50) {
            return "Invalid count of workers";
        }
        return countOfWorkers + "";
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        if (name.length() < 3) {
            return "Invalid name";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getPhoneNumber() {
        if (phoneNumber.length() < 8 &&
                !(phoneNumber.matches("[0-9]+")) &&
                Integer.parseInt(phoneNumber) < 0) {
            return "Invalid phone number";
        }
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    int[] getProducts() {
        return products;
    }

    void setProducts(int[] products) {
        this.products = products;
    }

    private String toString(String s) {
        return ("Name: " + getName() + "\nCount of workers: " + getCountOfWorkers() + "\nPhone number: " +
                getPhoneNumber() + "\nProducts: " + Arrays.toString(getProducts()));
    }

    public String display() {
        return toString(toString());
    }
}
