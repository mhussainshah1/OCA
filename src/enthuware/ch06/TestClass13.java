package enthuware.ch06;

public class TestClass13 {

    public void method(Object o) {
        System.out.println("Object Version");
    }

    public void method(java.io.FileNotFoundException s) {
        System.out.println("java.io.FileNotFoundException Version");
    }

    public void method(java.io.IOException s) {
        System.out.println("IOException Version");
    }

    public static void main(String args[]) {
        TestClass13 tc = new TestClass13();
        tc.method(null);
    }
}
