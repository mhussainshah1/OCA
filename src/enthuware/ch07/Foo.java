package enthuware.ch07;

interface Bar {

    void bar();
}

abstract class FooBase {

    public static void bar() {
        System.out.println("In static bar");
        float f = 4;
    }
}

public class Foo extends FooBase implements Bar {
}
