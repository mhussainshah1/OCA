/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

public class Fortress {

    public void openDrawbridge() throws Exception {
        try {
            throw new Exception("Circle");
        } catch (Exception e) {
            System.out.print("Opening!");
        } finally {
            System.out.print("Walls"); // p2
        }
    }

    public static void main(String[] moat) {
        new Fortress().openDrawbridge(); // p3
    }
}
