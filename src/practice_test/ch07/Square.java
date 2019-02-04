package practice_test.ch07;

abstract class Parallelogram {

    private int getEqualSides() {
        return 0;
    }
}

abstract class Rectangle extends Parallelogram {

    public static int getEqualSides() {
        return 2;
    } // x1
}

public final class Square extends Rectangle {

    public int getEqualSides() {
        return 4;
    } // x2

    public static void main(String[] corners) {
        final Square myFigure = new Square(); // x3
        System.out.print(myFigure.getEqualSides());
    }
}
