package enthuware.standard_test;

public class Conversion {

    public static void main(String[] args) {
        int i = 1234567890;
        float f = i;
        System.out.println((int)f);
        System.out.println(i - (int) f);
    }
}
