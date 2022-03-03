package day18;

public class Main {
    public static void main(String[] args) {
        storeClass();
    }

    public static void personClass() {
        Person person = new Person();
        person.setFirstName("Artak");
        person.setLastName("Karapetyan");
        person.setPassportId("AN123456");
        person.setAge(24);
        person.setGender("Male");
        person.setNationality("Armenian");
        System.out.print(person.display());
    }

    public static void triangleClass() {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.countTriangle(triangle.getSideA(), triangle.getSideB(), triangle.getSideC()));
        System.out.println(triangle.countTriangle(triangle.getSideA(), triangle.getSideB()));
    }

    public static void storeClass() {
        Store store = new Store();
        store.setName("\"Books & Accessories\"");
        store.setCountOfWorkers(5);
        store.setPhoneNumber("56789123");
        store.setProducts(new int[]{1, 2, 5, 19, 13});
    }
}
