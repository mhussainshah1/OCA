package OCA.ch02;

public class LogicalOperator {

    public static void main(String[] args) {
        boolean x = true, x1 = false;
        boolean y = true, y1 = false;

        //AND &
        System.out.println(x & y);//true
        System.out.println(x & y1);//false
        System.out.println(x1 & y);//false
        System.out.println(x1 & y1);//false

        //Inclusive OR |
        System.out.println(x | y);//true
        System.out.println(x | y1);//true
        System.out.println(x1 | y);//true
        System.out.println(x1 | y1);//false

        //Exclsive OR ^
        System.out.println(x ^ y);//false
        System.out.println(x ^ y1);//true
        System.out.println(x1 ^ y);//true
        System.out.println(x1 ^ y1);//false

        //conditional operators
        int b = 0;
        boolean a = true || (b < 4);
       
        int x3 = 6;
        boolean y3 = (x3 >= 6) || (++x3 <= 7);//if  LH operand is true then dont evaluates RH operand
        System.out.println(x3);
        
        y3 = (x3 >= 6) | (++x3 <= 7);//evaluates both operands
        System.out.println(x3);
        
        Integer x2 = null;
        if (x2 != null && x2.intValue() < 5) {//if  LH Operand is false then dont evaluates RH operand
            System.out.println("Inside");
        }

        if (x2 != null & x2.intValue() < 5) { //evaluates both operands
            System.out.println("Inside");
        }
    }
}
