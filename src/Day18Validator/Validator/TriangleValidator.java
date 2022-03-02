package Day18Validator.Validator;

public final class TriangleValidator {

    private TriangleValidator() {

    }

    public static boolean isValidSide(int side){
        return side > 1 && side < 20;
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
