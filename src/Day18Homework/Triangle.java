package Day18Homework;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    int getSideA() {
        if (sideA < 1 || sideA > 20) {
            return -999999;
        }
        return sideA;
    }

    void setSideA(int sideA) {
        this.sideA = sideA;
    }

    int getSideB() {
        if (sideB < 1 || sideB > 20) {
            return -999999;
        }
        return sideB;
    }

    void setSideB(int sideB) {
        this.sideB = sideB;
    }

    int getSideC() {
        if (sideC < 1 || sideC > 20) {
            return -999999;
        }
        return sideC;
    }

    private void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public Triangle() {

    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    private boolean isTriangleValid(int sideA, int sideB, int sideC) {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
    }

    private boolean isTriangleRight(int sideA, int sideB, int sideC) {
        return sideA * sideA + sideB * sideB == sideC * sideC ||
                sideA * sideA + sideC * sideC == sideB * sideB ||
                sideB * sideB + sideC * sideC == sideA * sideA;
    }

    int countTriangle(int sideA, int sideB, int sideC) {
        int perimeter = 0;
        if (isTriangleValid(sideA, sideB, sideC)) {
            perimeter = getSideA() + getSideB() + getSideC();
        }
        return perimeter;
    }

    int countTriangle(int sideA, int sideB) {
        int area = 0;
        if (isTriangleRight(sideA, sideB, sideC)) {
            area = getSideA() * getSideB() * 2;
        }
        return area;
    }
}
