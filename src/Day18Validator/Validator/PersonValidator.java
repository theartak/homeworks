package Day18Validator.Validator;

public final class PersonValidator {

    private final static String aToZ = "[a-z]+";
    private final static String zeroToNine = "[0-9]+";

    private PersonValidator() {

    }

    public static boolean isValidFirstName(String firstName) {
        return firstName != null &&
                firstName.length() >= 3 &&
                firstName.length() <= 15;
    }

    public static boolean isValidLastName(String lastName) {
        return lastName != null &&
                lastName.length() >= 6 &&
                lastName.length() <= 20;
    }

    public static boolean isValidPassportID(String passportID) {
        return passportID != null &&
                passportID.substring(0, 2).toUpperCase().matches("AN") &&
                passportID.substring(2).matches(zeroToNine) && passportID.length() == 8;
    }

    public static boolean isValidAge(int age) {
        return (age >= 18 && age <= 99);
    }

    public static boolean isValidGender(String gender) {
        return gender != null && (
                gender.toLowerCase().equalsIgnoreCase("male") ||
                        gender.toLowerCase().equalsIgnoreCase("female"));
    }

    public static boolean isValidNationality(String nationality) {
        return nationality != null && nationality.length() != 0
                && nationality.toLowerCase().matches(aToZ);
    }
}