package OCA.ch03.review;

import java.util.ArrayList;
import java.util.List;

public class TwentySix {

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for (int age : ages) {
            System.out.print(age);
        }
    }
}
