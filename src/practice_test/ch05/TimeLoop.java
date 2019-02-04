package practice_test.ch05;

public class TimeLoop {

    public static void main(String[] args) {
        //15 Infinite Loop
//        args = new String[]{"September","3","1940"};
//        for (int i = args.length; i >= 0; i++) {
//            System.out.println("args");
//        }

        //35
        args = new String[]{"September", "3", "1940"};
        for (int i = args.length; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}
