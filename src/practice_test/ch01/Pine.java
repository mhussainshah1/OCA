package practice_test.ch01;

public class Pine {

    public static void main(String[] args) {
        String tree = "pine";
        int count = 0;
        if (tree.equals("pine")) {
            int height = 55;
            count = count + 1;
        }
        System.out.print(height + count);
    }
}
