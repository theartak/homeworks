package Day18Homework;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {

    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 1 || sideA > 20) {
            System.out.println("Side A is out of range");
        }
        this.sideA = sideA;
    }

    int getSideB() {
        return sideB;
    }

    void setSideB(int sideB) {
        if (sideB < 1 || sideB > 20) {
            System.out.println("Side B is out of range");
        }
        this.sideB = sideB;
    }

    int getSideC() {
        return sideC;
    }

    private void setSideC(int sideC) {
        if (sideC < 1 || sideC > 20) {
            System.out.println("Side C is out of range");
        }
        this.sideC = sideC;
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
