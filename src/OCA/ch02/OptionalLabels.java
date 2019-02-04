package OCA.ch02;

public class OptionalLabels {

    public static void main(String[] args) {
        //Label
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        OUTER_LOOP:
        for (int i = 0; i < myComplexArray.length; i++) {
            INNER_LOOP:
            for (int j = 0; j < myComplexArray[i].length; j++) {
                System.out.print("[" + i + "," + j + "] " + myComplexArray[i][j] + "\t");
            }
            System.out.println();
        }
        /**
         * Allows optional Allows unlabeled Allows continue labels break
         * statement
         * ------------------------------------------------------------- if Yes
         * * No No while Yes Yes Yes do while Yes Yes Yes for Yes Yes Yes switch
         * Yes Yes No
         *
         * Labels are allowed for any block statement, including those that are
         * preceded with an if-then statement.
         */

        OUT:
        if (2 < 5) {
            System.out.println("inside");
            break OUT;
            //continue;//Error: continue use in loop only
        } else {
            System.out.println("Else");
            //break;//Error: break use in loop or switch 
        }
        System.out.println("Out");
        System.out.println(1 % 2);
    }
}
