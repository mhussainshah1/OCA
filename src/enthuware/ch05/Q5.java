package enthuware.ch05;

public class Q5 {

    public static void main(String[] args) {
        int INT1 = 1, INT2 = 3;
        for (int i = INT1; i < INT2; i++) {
            System.out.println(i);
        }

        for (int i = INT1; i < INT2; System.out.println(++i));

        for (int i = INT1; i++ < INT2; System.out.println(i));

        int i = INT1;
        while (i++ < INT2) {
            System.out.println(i);
        }
        
        i = INT1;
        do {
            System.out.println(i);
        } while (i++ < INT2);
    }
}
