/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_test.ch09;

import java.util.function.Predicate;
import java.util.function.Function;

/**
 *
 * Interface Predicate<T> provides	boolean test(T t) Interface Funtion<T,R>
 * provides	R apply (T t) Interface Consumer<T> provides	void accept(T t)
 *
 * @author m_hus
 */
public class Lambda {

    public static void main(String[] args) {
        //13
        Predicate<StringBuilder> p;
        p = (StringBuilder b) -> {
            return true;
        };
        //or
        p = (StringBuilder b) -> true;

        //16
        Predicate<String> pred1 = s -> false;
        Predicate<String> pred2 = (s) -> false;
        //Predicate<String> pred3 = String s -> false;
        Predicate<String> pred4 = (String s) -> false;

        //28
        Predicate<String> dash = c -> c.startsWith("-");
        System.out.println(dash.test("–"));

        //31
        Predicate<Integer> ip;
        ip = i -> i != 0;
        ip = i -> {
            return i != 0;
        };
        System.out.println(ip.test(1));

        //34
        Predicate clear = c -> c.equals("clear");
        System.out.println(clear.test("pink"));

    }
}
