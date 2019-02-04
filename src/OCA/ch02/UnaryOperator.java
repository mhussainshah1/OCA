package OCA.ch02;

public class UnaryOperator {

    public static void main(String[] args) {
        //logical complement operator, !
        boolean x = false;
        System.out.println(x); // false
        x = !x;
        System.out.println(x); // true

        //negation operator,
        double y = 1.21;
        System.out.println(y); // 1.21
        y = -y;
        System.out.println(y); // -1.21
        y = -y;
        System.out.println(y); // 1.21

//        int x = !5; // DOES NOT COMPILE
//        boolean y = -true; // DOES NOT COMPILE
//        boolean z = !0; // DOES NOT COMPILE
    }
}
