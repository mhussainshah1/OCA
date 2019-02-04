package practice_test.ch03;

public class Kansas {
    //38

    public static void main(String[] args) {
        int colorOfRainbow = 10;
        final int red = 5;
        switch (colorOfRainbow) {
            default:
                System.out.print("Home");
                break;
            case red:
                System.out.print("Away");
        }
    }
}
