package enthuware.Test;

public class TestClass {

    public static void main(String[] args) {
        calculate(2);
    }

    public static void calculate(int x) {
        String val;
        switch (x) {
            case 2:
            default:
                val = "def";
        }
        System.out.println(val);
    }

    public void ifTest(boolean flag) {
        if (flag) //1    
        {
            if (flag) //2    
            {
                System.out.println("True False");
            } else // 3    
            {
                System.out.println("True True");
            }
        } else // 4    
        {
            System.out.println("False False");
        }
    }

    public int transformNumber(int n) {
        int radix = 2;
        int output = 0;
        output += radix * n;
        radix = output / radix;
        if (output < 14) {
            return output;
        } else {
            output = output * radix / 2;
            return output;
        }else {        
                return output/2;    
        }
    }
}
