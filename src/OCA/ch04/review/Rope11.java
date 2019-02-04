//11. Which are true of the following code? (Choose all that apply)
package OCA.ch04.review;

import OCA.ch04.review.rope.Rope;

public class Rope11 {

    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing();
        //climb();
    }

    public static void main(String[] args) {
        Rope11 rope = new Rope11();
        rope.play();
        Rope11 rope2 = null;
        rope2.play();
    }
}
