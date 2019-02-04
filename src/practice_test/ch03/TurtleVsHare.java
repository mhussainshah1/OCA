package practice_test.ch03;

public class TurtleVsHare {
    //40

    public static void main(String[] arguments) {
        int turtle = 10 * (2 + (3 + 2) / 5);
        int hare = turtle < 5 ? 10 : 25;
        System.out.print(turtle < hare ? "Hare wins!" : "Turtle wins!");
    }
}
