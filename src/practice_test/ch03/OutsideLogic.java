package practice_test.ch03;

public class OutsideLogic {
    //46

    public static void main(String... weather) {
        System.out.print(weather[0] != null
                && weather[0].equals("sunny")
                && !false
                        ? "Go Outside" : "Stay Inside");
    }
}
