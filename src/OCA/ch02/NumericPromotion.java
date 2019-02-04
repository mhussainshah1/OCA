package OCA.ch02;

public class NumericPromotion {

    public static void main(String[] args) {
        /**
         * 1. If two values have different data types, Java will automatically
         * promote one of the values to the larger of the two data types.
         */
        int x = 1;
        long y = 33;
        long z = x * y;

        double a = 39.21;
//        float b = 2.1; // Error: double can't fit in the float
//        double c = a +b;

        /**
         * 3. Smaller data types, namely byte, short, and char, are first
         * promoted to int any time they’re used with a Java binary arithmetic
         * operator, even if neither of the operands is int.
         */
        short i = 10, j = 3;
//        short k = i/j; //Error: Out put is int

        short x1 = 14;
        float y1 = 13;
        double z1 = 30;
        double d = x1 * y1 / z1;

    }
}
