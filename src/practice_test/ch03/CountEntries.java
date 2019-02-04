package practice_test.ch03;

public class CountEntries {
    //41

    public static int getResult(int threshold) {
        return threshold > 5 ? 1 : 0;
    }

    public static final void main(String[] days) {
        System.out.print(getResult(5) + getResult(1) + getResult(0) + getResult(2) + "");
    }
}
