package practice_test.ch02;

public class DefaultInstanceVariableValue {

    static int defaultValue;
    int i;

    public void myVariableCheck() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println(defaultValue);
        new DefaultInstanceVariableValue().myVariableCheck();

    }
}
