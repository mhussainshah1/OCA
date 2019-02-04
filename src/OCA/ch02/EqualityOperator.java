package OCA.ch02;

import java.io.File;

public class EqualityOperator {

    public static void main(String[] args) {
        System.out.println(5 == 5.0);// 5.0 == 5.0 (Left side promoted to double)
        System.out.println("hi" == "hi");
        System.out.println(null == null);

//        boolean a = true == 3; // DOES NOT COMPILE
//        boolean b = false != "Giraffe"; // DOES NOT COMPILE
//        boolean c = 3 == "Kangaroo"; // DOES NOT COMPILE
        boolean y = false;
        boolean x = (y = true);
        System.out.println(x); // Outputs true

        File f = new File("myFile.txt");
        File g = new File("myFile.txt");
        File h = f;
        System.out.println(f == g); // Outputs false
        System.out.println(f == h); // Outputs true

    }
}
