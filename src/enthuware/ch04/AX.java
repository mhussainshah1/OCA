package enthuware.ch04;

public class AX {


    static int[] x = new int[0];

    static {
        System.out.println(x.length);
        //x[0] = 10;
    }

    public static void main(String[] args) {
        AX ax = new AX();
    }
}
