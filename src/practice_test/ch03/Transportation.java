package practice_test.ch03;

public class Transportation {
    //25

    public static String travel(int distance) {
        return distance < 1000 ? "train" : 10;
    }

    public static void main(String[] answer) {
        System.out.print(travel(500));
    }
}
