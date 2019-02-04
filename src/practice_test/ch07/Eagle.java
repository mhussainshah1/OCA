package practice_test.ch07;

interface CanFly {

    public void fly() {
    }
}

final class Bird {

    public int fly(int speed) {
    }
}

public class Eagle extends Bird implements CanFly {

    public void fly() {
    }
}
