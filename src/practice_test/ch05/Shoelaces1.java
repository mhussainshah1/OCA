package practice_test.ch05;

//47 Infinite Loop
public class Shoelaces1 {

    public static void main(String[] args) {
        String tie = null;
        while (tie == null);
        tie = "shoelace";
        System.out.print(tie);
    }
}
