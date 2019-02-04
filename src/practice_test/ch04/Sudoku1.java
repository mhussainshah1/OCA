package practice_test.ch04;

//42
public class Sudoku1 {

    static int[][] game;

    public static void main(String[] args) {
        game[3][3] = 6;
        Object[] obj = game;
        game[3][3] = "X";
        System.out.println(game[3][3]);
    }
}
