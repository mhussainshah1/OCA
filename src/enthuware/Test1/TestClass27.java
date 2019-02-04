package enthuware.Test1;

public class TestClass27 {

    public static int getSwitch(String str) {
        return (int) Math.round(Double.parseDouble(str.substring(1, str.length() - 1)));
    }

    public static void main(String args[]) {
        System.out.println(getSwitch("--0.50"));
        switch (getSwitch("--0.50")) {
            case 0:
                System.out.print("Hello ");
            case 1:
                System.out.print("World");
                break;
            default:
                System.out.print("Good Bye");
        }
    }
}
