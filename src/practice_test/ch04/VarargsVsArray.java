package practice_test.ch04;

import java.util.Arrays;

public class VarargsVsArray {

    public static void main(String[] args) {
        //5
        printStormName("Arlene");
        printStormName(new String[]{"Bret"});

        //printStormNames("Cindy");
        printStormNames(new String[]{"Don"});
    }
    //5

    public static void printStormName(String... names) {
        System.out.println(Arrays.toString(names));
    }

    public static void printStormNames(String[] names) {
        System.out.println(Arrays.toString(names));
    }

}
