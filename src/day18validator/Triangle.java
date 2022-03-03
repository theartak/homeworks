package day18validator;

import static day18validator.validator.TriangleValidator.*;

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
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int countTriangle(int sideA, int sideB, int sideC) {
        int perimeter = 0;
        if (isValidTriangle(sideA, sideB, sideC)) {
            perimeter = getSideA() + getSideB() + getSideC();
        }
        return perimeter;
    }

    public int countTriangle(int sideA, int sideB) {
        int area = 0;
        if (isTriangleRight(sideA, sideB, sideC)) {
            area = getSideA() * getSideB() * 2;
        }
        return area;
    }
}
