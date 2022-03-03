package day18validator;

import static day18validator.validator.PersonValidator.*;
import static day18validator.validator.TriangleValidator.*;
import static day18validator.validator.StoreValidator.*;

public class Main {
    public static void main(String[] args) {
        personClass();
    }

    public static void personClass() {
        Person person = new Person();
        if (isValidFirstName("Artak")) {
            person.setFirstName("Artak");
        }
        if (isValidLastName("Karapetyan")) {
            person.setLastName("Karapetyan");
        }
        if (isValidAge(24)) {
            person.setAge(24);
        }
        if (isValidPassportID("AN123456")) {
            person.setPassportId("AN123456");
        }
        if (isValidGender("male")) {
            person.setGender("male");
        }
        if (isValidNationality("Armenian")) {
            person.setNationality("Armenian");
        }
        System.out.println(person.display());
    }

    public static void triangleClass() {
        Triangle triangle = new Triangle(3, 4, 5);
        if (isValidSide(3)) {
            triangle.setSideA(3);
        }
        if (isValidSide(4)) {
            triangle.setSideB(4);
        }
        if (isValidSide(5)) {
            triangle.setSideC(5);
        }
        if (isTriangleRight(triangle.getSideA(), triangle.getSideB(), triangle.getSideC())) {
            System.out.println(triangle.countTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
        }
        if (isValidTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC())) {
            System.out.println(triangle.countTriangle(triangle.getSideA(), triangle.getSideB()));
        }
    }

    public static void storeClass() {
        Store store = new Store();
        int[] product = {1, 2, 3, 4, 5};
        if (isValidCountOfWorkers(10)) {
            store.setCountOfWorkers(10);
        }
        if (isValidName("Books & Accessories")) {
            store.setName("Books & Accessories");
        }
        if (isValidPhoneNumber("09919091")) {
            store.setPhoneNumber("09919091");
        }
        if (isValidProduct(product)) {
            store.setProducts(product);
        }
        System.out.println(store.display());
    }
}
