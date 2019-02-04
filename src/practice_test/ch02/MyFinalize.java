package practice_test.ch02;

public class MyFinalize {

    public static void main(String args[]) {
        MyFinalize a = new MyFinalize();
        a.finalize();
        a.finalize();
        a = null;
        System.gc();
    }

    @Override
    protected void finalize() {
        System.out.println("I am in finalize...");
    }
}
