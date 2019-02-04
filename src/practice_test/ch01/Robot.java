/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch01;

public class Robot {

    static String weight = "A lot";
    /* default */ double ageMonths = 5, ageDays = 2;
    private static boolean success = true;

    public void main(String[] args) {
        final String retries = "1";
        // P1
        System.out.println(" " + weight + " " + ageMonths + " " + ageDays + " " + success);
        System.out.println(retries);
    }
}
