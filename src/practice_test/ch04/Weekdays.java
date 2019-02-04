package practice_test.ch04;

public class Weekdays {

    public static void main(String[] args) {
        //8
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        //23
//        for (int i = 0; i < days.size(); i++) {//Error: can't find method
//            System.out.println(days[i]);
//        }
        //35
//        for (int i = 1; i <= days.length; i++) {//Error:ArrayIndexOutOfBoundsExcepti
//            System.out.println(days[i]);
//        }
        //45
        days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int i = 1; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
