package practice_test.ch07;

abstract class Triangle {

    abstract String getDescription();
}

class RightTriangle extends Triangle {

    @Override
    protected String getDescription() {
        return "rt";
    } // g1
}

public abstract class IsoscelesRightTriangle extends RightTriangle { // g2

    @Override
    public String getDescription() {
        return "irt";
    }

    public static void main(String[] edges) {
        final Triangle shape = new IsoscelesRightTriangle(); // g3
        System.out.print(shape.getDescription());
    }
}
