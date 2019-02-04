package OCA.ch02;

public class CompundAssignment {

    int x, y = 3;

    {
        x *= y;
        System.out.println(x);
    }

    public static void main(String[] args) {
        //varible should be defined
        int a = 2, b = 3;
        //a = a * b;       
        a *= b; //16
        CompundAssignment c = new CompundAssignment();

        //Autotype casting
        long i = 10;
        int j = 5;
        //i = i * j; // DOES NOT COMPILE
        i *= j; //Auto type casting

        long x = 5;
        long y = (x = 3);
        System.out.println(x); // Outputs 3
        System.out.println(y); // Also, outputs 3
    }
}
