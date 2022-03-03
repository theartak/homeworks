package day18;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public Person() {

    }

    public Person(String firstName, String lastName, String passportId, int age, String gender, String nationality) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPassportId(passportId);
        this.setAge(age);
        this.setGender(gender);
        this.setNationality(nationality);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || !firstName.toLowerCase().matches("[a-z]+") &&
                firstName.length() < 3 || firstName.length() > 15) {
            System.out.println("Invalid first name");
        }
        this.firstName = firstName;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || !lastName.toLowerCase().matches("[a-z]+") &&
                lastName.length() < 6 || lastName.length() > 20) {
            this.lastName = "Invalid last name";
        }
        this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        if (passportId == null || !(passportId.substring(0, 2).toUpperCase().matches("AN") &&
                passportId.substring(2).matches("[0-9]+")) || passportId.length() > 8) {
            this.passportId = "Invalid passport ID";
        }
        this.passportId = passportId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 99) {
            System.out.println("Invalid age");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || !(gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female"))) {
            this.gender = "Invalid gender";
        }
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (nationality == null || !nationality.toLowerCase().matches("[a-z]+")) {
            this.nationality = "Invalid nationality";
        }
        this.nationality = nationality;
    }

    public String display() {
        return "Name: " + getFirstName() + "\nLast name: " + getLastName() + "\nPassport ID: " + getPassportId()
                + "\nAge: " + getAge() + "\nGender: " + getGender() + "\nNationality: " + getNationality();
    }
}
