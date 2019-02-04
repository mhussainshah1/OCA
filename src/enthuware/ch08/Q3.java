package enthuware.ch08;

public class Q3 {

    public static void main(String[] args) {
//Assume that it is called with a very large integer. 
//Assume that it is called as such: printMe(null);  
//Assume that method m2 is invoked.
        Q3 q = new Q3();
        //q.factorial(Integer.MAX_VALUE);
        //q.printMe(null);
        q.m2();
    }

    // 1. 
    int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //2. 
    void printMe(Object[] oa) {
        for (int i = 0; i <= oa.length; i++) {
            System.out.println(oa[i]);
        }
    }

    //3. 
    Object m1() {
        return new Object();
    }

    void m2() {
        String s = (String) m1();
    }

}
