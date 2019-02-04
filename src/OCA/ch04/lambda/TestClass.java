package OCA.ch04.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//What can be inserted in the code below so that it will print true when run?
public class TestClass {

    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {
        boolean b = checkList(new ArrayList(), al -> al.isEmpty());
        System.out.println(b);

        b = checkList(new ArrayList(), al -> al.add("hello"));
        b = checkList(new ArrayList(), (ArrayList al) -> al.isEmpty());//DOESN'T COMPILE
        System.out.println(b);
    }
}
