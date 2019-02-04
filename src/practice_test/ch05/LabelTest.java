package practice_test.ch05;

public class LabelTest {

    public static void main(String[] args) {
        //37
        String race = "";
        loops:
//        do {
//           race += "x";
//           break loop;
//        } while (true);
        System.out.println(race);

        //41
        t:
        while (true) {
            f:
            while (true) {
                break t;
            }
        }

        //48
//        int result = 8;
//        for: while (result > 7) {
//           result++;
//           do {
//              result--;
//           } while (result > 5);
//           break for;
//        }
//        System.out.println(result);
    }
}
