package OCA.ch03.review;

import java.util.ArrayList;
import java.util.List;

public class Twenty {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add(7);
        for (String s : list) {
            System.out.print(s);
        }
    }
}
