package practice_test.ch06;

public class Puppy {

    public static int wag = 5;// q1

    public void Puppy(int wag) { // q2
        this.wag = wag;
    }

    public static void main(String[] tail) {
        System.out.print(new Puppy(2).wag); // q3
    }
}
