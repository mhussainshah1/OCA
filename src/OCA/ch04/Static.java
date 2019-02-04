package OCA.ch04;

public class Static {

    private String name = "Static class";

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
        second();
    }

    public static void main(String args[]) {
        first();
        second();
        third(); // DOES NOT COMPILE
    }
}
