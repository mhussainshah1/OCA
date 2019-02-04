package OCA.ch01;

public class Primitive {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);//2147483647
        // long max = 3123456789; // DOES NOT COMPILE
        long max = 3123456789L;
        System.out.println(56); // 56
        System.out.println(0b11); // 3
        System.out.println(017); // 15
        System.out.println(0x1F); // 31

        int million1 = 1000000;
        int million2 = 1_000_000;

        //double notAtStart = _1000.00; // DOES NOT COMPILE
        //double notAtEnd = 1000.00_; // DOES NOT COMPILE
        //double notByDecimal = 1000_.00; // DOES NOT COMPILE
        //double notByDecimal = 1000._00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // this one compiles

        //Autoboxing
        byte b = 123;
        short s = 123;

    }
}
