package Day18Homework;

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
        if (!firstName.toLowerCase().matches("[a-z]+") &&
                firstName.length() < 3 || firstName.length() > 15) {
            return "Invalid first name";
        }
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        if (!lastName.toLowerCase().matches("[a-z]+") &&
                lastName.length() < 6 || lastName.length() > 20) {
            return "Invalid last name";
        } else return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportId() {
        if (!(passportId.substring(0, 2).toUpperCase().matches("AN") &&
                passportId.substring(2).matches("[0-9]+")) || passportId.length() > 8) {
            return "Invalid passport ID";
        }
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getAge() {
        if (age < 18 || age > 99) {
            return "Invalid age";
        }
        return (age + "");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        if (!(gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female"))) {
            return "Invalid gender";
        }
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        if (!nationality.toLowerCase().matches("[a-z]+")) {
            return "Invalid nationality";
        }
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String display() {
        return toString(toString());
    }

    private String toString(String s) {
        return ("Name: " + getFirstName() + "\nLast name: " + getLastName() + "\nPassport ID: " + getPassportId()
                + "\nAge: " + getAge() + "\nGender: " + getGender() + "\nNationality: " + getNationality());
    }
}
