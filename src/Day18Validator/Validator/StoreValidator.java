package Day18Validator.Validator;

public final class StoreValidator {

    private final static String zeroToNine = "[0-9]+";

    private StoreValidator() {

    }

    public static boolean isValidCountOfWorkers(int countOfWorkers) {
        return countOfWorkers >= 2 && countOfWorkers <= 50;
    }

    public static boolean isValidName(String name) {
        return name != null && name.length() >= 3;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null &&
                phoneNumber.length() == 8 &&
                phoneNumber.matches(zeroToNine) &&
                Integer.parseInt(phoneNumber) >= 0;
    }

    public static boolean isValidProduct(int[] products) {
        return products.length != 0;
    }
}
