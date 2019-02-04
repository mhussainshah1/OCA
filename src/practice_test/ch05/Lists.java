package practice_test.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        //12
        List<String> drinks = Arrays.asList("can", "cup");
        for (int container = drinks.size() - 1; container >= 0; container--) {
            System.out.print(drinks.get(container) + ",");
        }

        //13
        List<String> bottles = Arrays.asList("glass", "plastic");
        for (int type = 0; type < bottles.size();) {
            System.out.print(bottles.get(type) + ",");
            break;
        }
        System.out.print("end");

        //20
        drinks = Arrays.asList("can", "cup");
        for (int container = 0; container < drinks.size(); container++) {
            System.out.print(drinks.get(container) + ",");
        }

        //26
        // ArrayList<Integer> taxis = new ArrayList<>();
        int[] taxis = new int[1];
//        StringBuilder taxis = new StringBuilder();
        for (Object obj : taxis) {
            System.out.println("\n" + obj);
        }

        //30
        int count = 10;
        List<Character> chars = new ArrayList<>();
        do {
            chars.add('a');
            for (Character x : chars) {
                count -= 1;
            }
        } while (count > 0);
        System.out.println(chars.size());

        //33
//        bottles = Arrays.asList("glass", "plastic");
//        for (int type = 0; type < bottles.size();)
//            System.out.print(bottles.get(type) + ",");
//            break;
//        System.out.print("end");
    }
}
