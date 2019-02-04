package OCA.ch02;

public class CastPrimitiveValue {

    public static void main(String[] args) {
        int x = (int) 1.0;           // Stored as 1
        short y = (short) 1921222;   // Stored as 20678
        int z = (int) 9f;            // Stored as 9
        long t = 192301398193810323L;// Stored as 192301398193810323

        System.out.print(2147483647 + 1); //-2147483648

        short x1 = 10;
        short y1 = 3;
        short z1 = (short) (x1 * y1); //30
    }
}
