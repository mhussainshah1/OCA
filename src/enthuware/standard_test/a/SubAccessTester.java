package enthuware.standard_test.a;

import enthuware.standard_test.b.AccessTester;

public class SubAccessTester extends AccessTester {

    public void test() {
        SubAccessTester ref = new SubAccessTester();
        ref.c();
    }
}
