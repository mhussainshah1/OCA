package practice_test.ch09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings {

    public static void main(String[] args) {
        //7
//        StringBuilder sb = new StringBuilder("radical")
//                .insert(sb.length(), "robots");//Error: sb isn't initialize
//        System.out.println(sb);

        //27
        String line1 = new String("-");
        String anotherLine1 = line1.concat("-");
        System.out.print(line1 == anotherLine1);
        System.out.print(" ");
        System.out.println(line1.length());

        //11
        StringBuilder line = new StringBuilder("-");
        StringBuilder anotherLine = line.append("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.println(line.length());

        //18
        String teams = new String("694");
        teams.concat(" 1155");
        teams.concat(" 2265");
        teams.concat(" 2869");
        System.out.println(teams);

        //21
        String[] array = {"Natural History", "Science"};
        List<String> museums = Arrays.asList(array);
        museums.set(0, "Art");
        System.out.println(museums.contains("Art"));

        //39
        String happy = " :) - (: ";
        String really = happy.trim();
        String question = happy.substring(1, happy.length() - 1);
        System.out.println(really.equals(question));

    }

    //24
    public static void secret(String mystery) {
        mystery = mystery.replace("1", "8");
        mystery.startsWith("paper");
        String s = mystery.toString();
    }

    //43
    public static void secret(StringBuilder mystery) {
        char ch = mystery.charAt(3);
        mystery = mystery.insert(1, "more");
        int num = mystery.length();
    }

    //12
    public static void secret(ArrayList<String> mystery) {
        mystery.add("metal");
        String str = mystery.get(0);
        int num = mystery.size();//Error: length() is not in the ArrayList<T>
    }

}
