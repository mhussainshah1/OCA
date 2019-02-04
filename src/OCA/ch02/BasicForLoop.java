package OCA.ch02;

public class BasicForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        //1. Creating an Infinite loop
//        for (;;) {
//            System.out.println("Hello World");
//        }
        //2. Adding Multiple Terms to the for Statement
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println(x);

        //3. Redeclaring a Variable in the Initialization Block
//        x = 0;
//        for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
//            System.out.print(x + " ");
//        }
        x = 0;
        long y = 10;
        for (y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.println(x + " ");
        }

        //4. Using Incompatible Data Types in the Initialization Block
        /**
         * The variables in the initialization block must all be of the same
         * type.
         */
//        for (long y = 0,  int x = 4;x< 5 && y<10; x++, y++) { // DOES NOT COMPILE
//            System.out.print(x + " ");
//        }
        //5. Using Loop Variables Outside the Loop
        for (long b = 0, a = 4; a < 5 && b < 10; a++, b++) {
            System.out.print(b + " ");
        }
        System.out.print(a); // DOES NOT COMPILE
    }
}
