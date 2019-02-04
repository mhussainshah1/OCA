package practice_test.ch04;

import java.util.Arrays;
//50

public class EchoFirst1 {

    public static void main(String[] args) {
        args = new String[2];
        args[0] = "seed";
        args[1] = "flower";

        Arrays.sort(args);
        String result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }
}
