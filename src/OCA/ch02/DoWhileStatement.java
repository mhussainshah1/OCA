package OCA.ch02;

public class DoWhileStatement {

    public static void main(String[] args) {
        int x = 0;
        do {
            x++;
        } while (false);
        System.out.println(x); // Outputs 1

        //While loop
        while (x > 10) {
            x--;
        }

        //Alternatively
        if (x > 10) {
            do {
                x--;
            } while (x > 10);
        }

        /**
         * although the first statement is shorter, the second has the advantage
         * that you could leverage the existing if-then statement and perform
         * some other operation in a new else branch
         */
        if (x > 10) {
            do {
                x--;
            } while (x > 10);
        } else {
            x++;
        }

    }
}
