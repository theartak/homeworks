package personstudent;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(null, 24);
        Person p2 = new Person(null, 24);
        Student s1 = new Student("Artak", 24, 5);
        Student s2 = new Student("Artak", 24, 5);;
        System.out.println(s1.equals(s2));
    }
}
