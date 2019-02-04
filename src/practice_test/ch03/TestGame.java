package practice_test.ch03;

public class TestGame {
    //42

    public String runTest(boolean spinner, boolean roller) {
        if (spinner = roller) {
            return "up";
        } else {
            return roller ? "down" : "middle";
        }
    }

    public static final void main(String pieces[]) {
        final TestGame tester = new TestGame();
        System.out.println(tester.runTest(false, true));
    }
}
