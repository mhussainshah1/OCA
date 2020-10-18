package OCA.ch02;

public class NestedLoop {

    public static void main(String[] args) {
        //Nested For Loop
        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        //1) Basic For Loop in 2D Array 
        for (int i = 0; i < myComplexArray.length; i++) {
            for (int j = 0; j < myComplexArray[i].length; j++) {
                System.out.print("[" + i + "," + j + "] " + myComplexArray[i][j] + "\t");
            }
            System.out.println();
        }
        //or
        //2) for-each Loop in 2D Array
        for (int[] mySimpleArray : myComplexArray) {
            for (int i : mySimpleArray) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        //or
        //3) Mixed for and for-each loop in 2D Array
        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

        //Nested While Loop
        int x = 8;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t");
        }
        System.out.println("");
    }
}
