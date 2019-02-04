package OCA.ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionArrayAndList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2

        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2

        String[] array = {"hawk", "robin"}; // [hawk, robin]
        list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) {
            System.out.print(b + " "); // new test
        }
        list.remove(1); // throws UnsupportedOperation Exception. 
        //we are not allowed to change the size of the list.

        list = Arrays.asList("one", "two");
    }
}
