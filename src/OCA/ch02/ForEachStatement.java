package OCA.ch02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachStatement {

    public static void main(String[] args) {
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for (String name : names) {
            System.out.print(name + ", ");
        }
        //or
        System.out.println("\nPrior Java 5");
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.print(name + ", ");
        }
        System.out.println("");

        List<String> values = new ArrayList<>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (String value : values) {
            System.out.print(value + ", ");
        }
        //or
        System.out.println("\nPrior Java 5");
        for (Iterator<String> i = values.iterator(); i.hasNext();) {
            String value = i.next();
            System.out.print(value + ", ");
        }

//        String names1 = "Lisa";
//        for (String name : names1) { // DOES NOT COMPILE
//            System.out.print(name + " ");
//        }
//        String[] names2 = new String[3];
//        for (int name : names2) { // DOES NOT COMPILE
//            System.out.print(name + " ");
//        }
        /**
         * If we wanted to print only the comma between names, we could convert
         * the example into a standard for loop
         */
        List<String> names3 = new ArrayList<>();
        names3.add("Lisa");
        names3.add("Kevin");
        names3.add("Roger");
        for (int i = 0; i < names3.size(); i++) {
            String name = names3.get(i);
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
        /**
         * use a standard for loop over a for-each loop if comparing multiple
         * elements in a loop within a single iteration,
         */
        int[] values1 = new int[3];
        values1[0] = 10;
        values1[1] = new Integer(5);
        values1[2] = 15;
        for (int i = 1; i < values1.length; i++) {
            System.out.print(values1[i] - values1[i - 1] + ",");
        }
    }
}
