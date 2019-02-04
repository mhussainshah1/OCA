package practice_test.ch03;

public class SwitchCase {

    public static void main(String args[]) {
        //18
        long dayOfWeek = 2;
        final int saturday = 6;
        switch (dayOfWeek) {
            default:
                System.out.print("Another Weekday");
                break;
            case saturday:
                System.out.print("Weekend!");
        }
    }
}
