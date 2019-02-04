package practice_test.ch02;

public class Sand {

    public Sand() {
        System.out.print("a");
    }

    public int Sand() {
        System.out.print("b");
        return 0;
    }

    public void run() {
        new Sand();
        Sand();
    }

    public static void main(String... args) {
        new Sand().run();
    }
}
