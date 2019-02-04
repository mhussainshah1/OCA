package practice_test.ch04;

public class MultiDimentionArrays {

    public static void main(String[] args) {
        //20
//        [][] String alpha;
//        [] String beta;
        String[][] gamma;
        String[] delta[];
        String epsilon[][];

        //39.
        boolean[][] bools1[], moreBools1;
        //24
        boolean[][][] bools, moreBools;

        //7
//        int[][] blue = new int[2, 2];
//        int[][] blue = new int[2], [2];
        int[][] blue = new int[2][2];
//        int[][] blue = new int[2 x 2];

        //16
        String[][] matrix = new String[1][2];
        matrix[0][0] = "Don't think you are, know you are."; // m1
        matrix[0][1] = "I'm trying to free your mind Neo"; // m2
//        matrix[1][0] = "Is all around you "; // m3
//        matrix[1][1] = "Why oh why didn't I take the BLUE pill?"; // m4

        //18
//        char[][] ticTacToe = new char[3,3]; // r1
        //26
        char[][] ticTacToe = new char[3][3]; // r1
//        ticTacToe[1][3] = 'X'; // r2
        ticTacToe[2][2] = 'X';
//        ticTacToe[3][1] = 'X';
        System.out.println(ticTacToe.length + " in a row!"); // r3

        //37
        ticTacToe = new char[3][3]; // r1
        ticTacToe[0][0] = 'X'; // r2
        ticTacToe[1][1] = 'X';
        ticTacToe[2][2] = 'X';
        System.out.println(ticTacToe.length + " in a row!"); // r3        

        //21
        char[][] blocks = new char[][]{{'a', 'b', 'c'}, {'d'}, {'e', 'f'}};

        //33. 
        int[][] nums1 = new int[2][1];
        int[] nums2[] = new int[2][1];
        int[] nums3[] = new int[][]{{0}, {0}};
        int[] nums4[] = new int[][]{{0, 0}};

        //43
        String[][] listing = new String[][]{{"Book"}, {"Game", "29.99"}};
        System.out.println(listing.length + " " + listing[0].length);

        //49. 
        int[][][][] nums1a, nums1b;
        int[][][] nums2a[], nums2b;
        int[][] nums3a[][], nums3b[][];
        int[] nums4a[][][], numbs4b[][][];
    }
}
