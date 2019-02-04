package practice_test.ch07;

class Rotorcraft {

    protected final int height = 5;

    abstract int fly();
}

public class Helicopter extends Rotorcraft {

    private int height = 10;

    protected int fly() {
        return super.height;
    }

    public static void main(String[] unused) {
        Helicopter h = (Helicopter) new Rotorcraft();
        System.out.print(h.fly());
    }
}
