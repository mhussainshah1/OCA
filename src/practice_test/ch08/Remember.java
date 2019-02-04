/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

public class Remember {

    public static void think() throws Exception { // k1
        try {
            throw new Exception();
        }
    }

    public static void main(String... ideas) throws Exception {
        think();
    }
}
