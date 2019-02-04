package enthuware.standard_test.b;

import enthuware.standard_test.a.AccessTest;
import enthuware.standard_test.c.SubAccessTester;

public class AccessTester extends AccessTest {

    public static void main(String[] args) {
        AccessTest ref1 = new AccessTest();
        ref1.c();//Can't access protected members outside package by class object
        
        AccessTester ref2 = new AccessTester(); 
        ref2.c();//Access by subclass object
        
        SubAccessTester ref3 = new SubAccessTester();
        ref3.c(); //Access by subclass of sunclass object
    }
}