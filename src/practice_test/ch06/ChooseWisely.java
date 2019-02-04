package practice_test.ch06;

public class ChooseWisely {

    public ChooseWisely() {
        super();
    }

    public int choose(int choice) {
        return 5;
    }

    public int choose(short choice) {
        return 2;
    }

    public int choose(long choice) {
        return 11;
    }

    public static void main(String[] path) {
        System.out.println(new ChooseWisely().choose((byte) 2 + 1));
        System.out.println(new ChooseWisely().choose((byte) 2));
    }
}
