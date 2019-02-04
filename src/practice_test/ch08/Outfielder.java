/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

class OutOfBoundsException extends BadCatchException {

}

class BadCatchException extends Exception {

}

public interface Outfielder {

    public void catchBall() throws OutOfBoundsException;
}

class Fielder implements Outfielder {

    @Override
    public void catchBall() throws OutOfBoundsException {

    }
}
