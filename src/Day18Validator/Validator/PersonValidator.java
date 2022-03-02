package Day18Validator.Validator;

public final class PersonValidator {

    final static String aToZ = "[a-z]+";
    final static String zeroToNine = "[0-9]+";

    private PersonValidator() {

    }

    public static boolean isValidFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            return false;
        }
        int len = firstName.length();
        return (len >= 3 && len <= 15);
    }

    public static boolean isValidLastName(String lastName) {
        if (lastName == null || lastName.length() == 0) {
            return false;
        }
        int len = lastName.length();
        return (len >= 6 && len <= 20);
    }

    public static boolean isValidPassportID(String passportID) {
        if (passportID == null || passportID.length() == 0) {
            return false;
        }
        int len = passportID.length();
        return (passportID.substring(0, 2).toUpperCase().matches("AN") &&
                passportID.substring(2).matches(zeroToNine) && len == 8);
    }

    public static boolean isValidAge(int age) {
        return (age >= 18 && age <= 99);
    }

    public static boolean isValidGender(String gender) {
        if (gender == null || gender.length() == 0) {
            return false;
        }
        return (gender.toLowerCase().equalsIgnoreCase("male") ||
                gender.toLowerCase().equalsIgnoreCase("female"));
    }

    public static boolean isValidNationality(String nationality) {
        return nationality != null && nationality.length() != 0 &&
                nationality.toLowerCase().matches(aToZ);
    }
}