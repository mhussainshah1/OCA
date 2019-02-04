package practice_test.ch03;

public class Rematerialize {

    //23
    public static void main(String[] input) {
        int dog = 11;
        int cat = 3;
        int partA = dog / cat; //3
        int partB = dog % cat; //2
        int newDog = partB + partA * cat;
        System.out.print(newDog);
    }
}
