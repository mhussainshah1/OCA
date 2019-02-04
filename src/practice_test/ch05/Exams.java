package practice_test.ch05;

import java.util.*;
//43

public class Exams {

    public static void main(String[] args) {
        List<String> exams = Arrays.asList("OCA", "OCP");
        for (String e1 : exams) {
            for (String e2 : exams) {
                System.out.println(e1 + " " + e2);
            }
        }
    }
}
