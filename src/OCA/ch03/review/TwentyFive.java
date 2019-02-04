package OCA.ch03.review;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwentyFive {

    public static void main(String[] args) {
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        for (String s : hex) {
            System.out.println(s);
        }
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);
    }
}
