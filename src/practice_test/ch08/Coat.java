/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

public class Coat {

    public Long zipper() throws Exception {
        try {
            String checkZipper = (String) new Object();
        } catch (Exception e) {
            throw RuntimeException("Broken!");
        }
        return null;
    }

    public static void main(String... warmth) {
        try {
            new Coat().zipper();
            System.out.print("Finished!");
        } catch (Exception t) {

        }
    }
}
