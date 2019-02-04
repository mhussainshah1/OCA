/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

public class Attendance {

    private Boolean[] list = new Boolean[10];// value omitted

    public int printTodaysCount() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (list[i]) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] roster) {
        new Attendance().printTodaysCount();
    }
}
