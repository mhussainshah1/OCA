package enthuware.ch05;

public class TestClass {

    public static void main(String[] args) {
        String String = "";   //This is valid.
        String:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 10) {
                    break String;
                }
            }
            System.out.println("hello");
        }
    }
}
