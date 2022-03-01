package Day18Validator.Validator;

public class TriangleValidator {

    private TriangleValidator() {

    }

    public static boolean isValidSideA(int sideA) {
        return sideA > 1 && sideA < 20;
    }

    public static boolean isValidSideB(int sideB) {
        return sideB > 1 && sideB < 20;
    }

    public static boolean isValidSideC(int sideC) {
        return sideC > 1 && sideC < 20;
    }

    public static boolean isValidTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    public static boolean isTriangleRight(int sideA, int sideB, int sideC) {
        return sideA * sideA + sideB * sideB == sideC * sideC ||
                sideA * sideA + sideC * sideC == sideB * sideB ||
                sideB * sideB + sideC * sideC == sideA * sideA;
    }
}
