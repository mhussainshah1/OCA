package OCA.ch02;

public class ArthimaticOperators {

    public static void main(String[] args) {

        int x1 = 2 * 5 + 3 * 4 - 8;
        System.out.println(x1);
        int x2 = 2 * ((5 + 3) * 4 - 8);
        System.out.println(x2);

        System.out.println(9 / 3); // Outputs 3
        System.out.println(9 % 3); // Outputs 0

        System.out.println(10 / 3); // Outputs 3
        System.out.println(10 % 3); // Outputs 1

        System.out.println(11 / 3); // Outputs 3
        System.out.println(11 % 3); // Outputs 2

        System.out.println(12 / 3); // Outputs 4
        System.out.println(12 % 3); // Outputs 0

        char a = 'a';
        char b = (char) (a + 1);
        System.out.println(b);
    }
}
