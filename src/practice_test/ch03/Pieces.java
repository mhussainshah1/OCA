package practice_test.ch03;

public class Pieces {

    //12
    public static void main(String[] info) {
        int flair = 15;
        if (flair >= 15 && flair < 37) {
            System.out.print("Not enough");
        }
        if (flair == 37) {
            System.out.print("Just right");
        } else {
            System.out.print("Too many");
        }
    }
}
