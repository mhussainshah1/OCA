package enthuware.Test1.testPackage;

import enthuware.Test1.other.*;

class Test {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.print((enthuware.Test1.testPackage.Other.hello == hello) + " ");     //line 1
        System.out.print((enthuware.Test1.other.Other.hello == hello) + " ");           //line 2
        System.out.print((hello == ("Hel" + "lo")) + " ");              //line 3
        System.out.print((hello == ("Hel" + lo)) + " ");                //line 4
        System.out.println(hello == ("Hel" + lo).intern());             //line 5
    }
}

class Other {
    static String hello = "Hello";
}
//true
//true
//true
