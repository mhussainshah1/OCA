package practice_test.ch09;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        //6
        List<String> tools = new ArrayList<>();
        tools.add("hammer");
        tools.add("nail");
        tools.add("hex key");
        System.out.println(tools.get(1));

        //8
        List<String> museums = new ArrayList<>(1);
        museums.add("Natural History");
        museums.add("Science");
        museums.add("Art");
        museums.remove(2);
        System.out.println(museums);

        //14
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.set(1, 'c');
        chars.remove(0);
        System.out.print(chars.size() + " " + chars.contains('b'));

        //23
        System.out.println(chars.size());//Error: length() is not in the ArrayList<T>

        //25
        List ballons = new ArrayList<>();
        List<String> ballons1 = new ArrayList<>();

        //42
        List<Integer> pennies = new ArrayList<>();
        pennies.add(3);
        pennies.add(2);
        pennies.add(1);
        pennies.remove(2);
        System.out.println(pennies);

        //48
        List<String> magazines = new ArrayList();
        magazines.add("Readers Digest");
        magazines.add("People");
        magazines.clear();
        magazines.add("The Economist");
        magazines.remove(1);//Error: IndexOutOfBoundException:Index 1 out-of-bounds for length
        System.out.println(magazines.size());
    }
}
