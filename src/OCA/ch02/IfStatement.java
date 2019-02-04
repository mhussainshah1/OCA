package OCA.ch02;

public class IfStatement {

    public static void main(String[] args) {

        int hourOfDay = 10;
        int morningGreetingCount = 0;

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        }

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
//
//        int x = 1;
//        if (x) { // DOES NOT COMPILE
//            
//        }
//
//        int y = 1;
//        if (y = 5) { // DOES NOT COMPILE
//            
//        }
//
        //Ternary Operator
        int y = 10;
        int x;
        if (y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
        //or
        x = (y > 5) ? (2 * y) : (3 * y);

        System.out.println((y > 5) ? 21 : "Zebra");
//        int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE

        int y1 = 1;
        int z1 = 1;
        final int x1 = y1 < 10 ? y1++ : z1++;
        System.out.println(y1 + "," + z1); // Outputs 2,1

        y1 = 1;
        z1 = 1;
        final int x2 = y1 >= 10 ? y1++ : z1++;
        System.out.println(y1 + "," + z1); // Outputs 1,2
    }
}
