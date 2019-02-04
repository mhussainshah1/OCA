package OCA.ch03;

public class Equality {

    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one.equals(two));//false
        System.out.println(one == three); // true

        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true

        String z = " Hello World".trim();
        System.out.println(x == z); // false

        x = new String("Hello World");
        System.out.println(x == y); // false

        System.out.println(x.equals(z)); // true
    }
}
