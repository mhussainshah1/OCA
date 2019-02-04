package practice_test.ch03;

public class Election {

    //9
    public void calculateResult(Integer candidateA, Integer candidateB) {
        boolean process = candidateA == null || candidateA.intValue() < 10;
        boolean value = candidateA && candidateB;
        System.out.print(process || value);
    }

    public static void main(String[] unused) {
        new Election().calculateResult(null, 203);
    }
}
