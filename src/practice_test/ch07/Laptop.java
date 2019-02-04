package practice_test.ch07;

class Computer {

    protected final int process() {
        return 5;
    }
}

public class Laptop extends Computer {

    public final int process() {
        return 3;
    }

    public static void main(String[] chips) {
        System.out.print(new Laptop().process());
    }
}
