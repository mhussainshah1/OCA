package practice_test.ch03;

public class ConditionallyLogical {

    //34
    public static void main(String... data) {
        data = new String[1];
        //data[0] = null;
        //data[0] = "sound";
        data[0] = "logic";

        if (data.length >= 1
                && (data[0].equals("sound") || data[0].equals("logic"))
                && data.length < 2) {
            System.out.print(data[0]);
        }
    }
}
