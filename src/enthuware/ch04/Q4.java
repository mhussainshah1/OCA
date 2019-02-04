package enthuware.ch04;

public class Q4 {

    public static void main(String[] args) {
        char cA[][] = new char[][]{{'a', 'b', 'c'}, {'a', 'b', 'c'}};
        char[][] cA1 = {{'a', 'b', 'c'}, {'a', 'b', 'c'}};

        char cA2[][] = new char[3][];
        for (int i = 0; i < cA.length; i++) {
            cA[i] = new char[4];
        }

        char cA3[][] = {new char[]{'a', 'b', 'c'}, new char[]{'a', 'b', 'c'}};
    }
}
