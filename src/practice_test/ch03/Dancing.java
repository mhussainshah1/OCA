package practice_test.ch03;

public class Dancing {

    //20
    public static void main(String[] vars) {
        int leaders = 10 * (2 + (1 + 2 / 5)); //30
        int followers = leaders * 2;//60
        System.out.print(leaders + followers < 10 ? "Too few" : "Too many");
        //90 < 10
    }
}
