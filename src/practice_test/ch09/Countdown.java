package practice_test.ch09;

public class Countdown {

    public static void main(String[] args) {
        //41
        StringBuilder builder1 = new StringBuilder("54321");
        builder1.substring(2);
        System.out.println(builder1.charAt(1));

        //30
        String builder = "54321";
        builder = builder.substring(4);
        System.out.println(builder.charAt(2));
        //Error:java.lang.StringIndexOutOfBoundsException: String index out of range
    }
}
