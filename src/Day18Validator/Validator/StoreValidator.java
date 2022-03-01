package Day18Validator.Validator;

public class StoreValidator {

    private StoreValidator() {

    }

    public static boolean isValidCountOfWorkers(int countOfWorkers) {
        return countOfWorkers >= 2 && countOfWorkers <= 50;
    }

    public static boolean isValidName(String name) {
        if (name == null || name.length() == 0) {
            return false;
        }
        int len = name.length();
        return len >= 3;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() == 0) {
            return false;
        }
        return phoneNumber.length() == 8 || phoneNumber.matches("[0-9]+") ||
                Integer.parseInt(phoneNumber) > 0;
    }

    public static boolean isValidProduct(int[] products) {
        return products.length != 0;
    }
}
