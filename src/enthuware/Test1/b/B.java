package enthuware.Test1.b;

import enthuware.Test1.a.A;

public class B extends A {

    B() {
    }

    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new B();
    }
}
