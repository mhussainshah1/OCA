package enthuware.ch05;

public class Q1 {

    public static void main(String[] args) {
        new Q1().method1(7);
    }

    public void method1(int i) {
        int j = (i * 30 - 2) / 100;
        System.out.println(j);
        
        POINT1:
        for (; j < 10; j++) {
            boolean flag = false;
            while (!flag) {
                if (Math.random() > 0.5) {
                    break POINT1;
                }
            }
        }
        while (j > 0) {
            System.out.println(j--);
            if (j == 4) {
                break POINT1;
            }
        }
    }
}
