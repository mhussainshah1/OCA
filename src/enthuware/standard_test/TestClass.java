package enthuware.standard_test;

public class TestClass {

    public static void main(String[] args) throws Exception {
        int a = Integer.MIN_VALUE;
        int b = -a;
        System.out.println(a + "   " + b);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
//        System.out.println(i1 == b1);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(b1));
        System.out.println(i1.equals(g1));
    }
}
