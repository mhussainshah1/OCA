package enthuware.ch04;

public class Q1 {

    public static void main(String[] args) {
        
        int[][] twoD = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10}};
        
        System.out.println(twoD[1].length);
        System.out.println(twoD[2].getClass().isArray());
        System.out.println(twoD[1][2]);

        
    }
}
