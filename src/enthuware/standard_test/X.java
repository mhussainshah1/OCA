package enthuware.standard_test;

public class X {

    static int k = 0;

//    static {
//        if (true) {
//            throw new NullPointerException();
//        }
//        //k = 10 / 0;
//    }
    public static void main(String[] args) {
        //Class.forName("String");  
//        short s = Short.MAX_VALUE;
//        char c = s;
//        System.out.println(c == Short.MAX_VALUE);
//        new X().myMethod(k);

        int a = 5, b = 7, k = 0;
        Integer m = null;
        k = new Integer(a) + new Integer(b);
        System.out.println(k);
        k = new Integer(a) + b;
        System.out.println(k);
        k = b + new Integer(a);
        System.out.println(k);
        m = new Integer(a) + new Integer(b);
        System.out.println(m);
        float f = 10.2F;
    }

    public void myMethod(int m, Object p, double d) {
        //...valid code here 
    }
}
