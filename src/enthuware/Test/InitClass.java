package enthuware.Test;

public class InitClass {

    int m;
    static int i1 = 5;
    static int i2;
    int j = 100;
    int x;

    static {
        i1++;
    }      // Static Initializer

    {
        j = 30;
        i2 = 40;
    }  // Instance Initializer

    public InitClass(int m) {
        System.out.println(i1 + " " + i2 + " " + x + " " + j + " " + m);
    }

    public static void main(String args[]) {
        InitClass obj = new InitClass(5);
    }
}
