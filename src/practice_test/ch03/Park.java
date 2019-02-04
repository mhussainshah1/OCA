package practice_test.ch03;

public class Park {

    //10
    public final static void main(String... arguments) {
        int pterodactyl = 6;
        long triceratops = 3;
        if (pterodactyl % 3 >= 1) {
            triceratops++;
        }
        triceratops--;
        System.out.print(triceratops);
    }
}
