package OCA.ch03;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    public static void main(String[] args) {
        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // [50.5]
        weights.add(new Double(60)); // [50.5, 60.0]
        weights.remove(50.5); // [60.0]
        double first = weights.get(0); // 60.0

        //Unbox a null
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        //int h = heights.get(0); // NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); //[1]
        numbers.add(2); //[1,2]

        numbers.remove(1); //[1]
        //or
        numbers.remove(new Integer(2));

        System.out.println(numbers); //[1]
    }
}
