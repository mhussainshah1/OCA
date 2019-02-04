package OCA.ch01;

public class Scope {

    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
        System.gc();
    }

    protected void finalize() {

        System.out.println("Calling finalize");
    }
}
