package enthuware.Test1;

public class TestClass7 {

    public void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "B":
                System.out.println("big bat");
            default:
                System.out.println("none");
        }
    }

    public static void main(String[] args) throws Exception {
        TestClass7 tc = new TestClass7();
        tc.switchString("B");

        Object t = new Integer(107);
        int k = (Integer) t.intValue() / 9;
        System.out.println(k);
        String[] sA = new String[] { "aaa"};
        
    }
}
