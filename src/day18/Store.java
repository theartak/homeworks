package day18;

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

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers < 2 || countOfWorkers > 50) {
            System.out.println("Out of range");
        } else {
            this.countOfWorkers = countOfWorkers;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            System.out.println("Invalid name");
        }
        this.name = name;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null ||
                phoneNumber.length() != 8 ||
                !(phoneNumber.matches("[0-9]+")) ||
                Integer.parseInt(phoneNumber) < 0) {
            System.out.println("Invalid phone number");
        }
        this.phoneNumber = phoneNumber;
    }

    public int[] getProducts() {
        return products;
    }

    public void setProducts(int[] products) {
        this.products = products;
    }

    public String display() {
        return ("Name: " + getName() + "\nCount of workers: " + getCountOfWorkers() + "\nPhone number: " +
                getPhoneNumber() + "\nProducts: " + Arrays.toString(getProducts()));
    }
}
