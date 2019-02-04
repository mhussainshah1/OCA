package OCA.ch04;

public class ExceptionList {

    //calling method
    public static void main(String[] args) /*throws IllegalArgumentException*/ {
        //handle exception
//        try {
        ExceptionList el = new ExceptionList();
        el.oneException();
//        } catch (IllegalArgumentException iae) {
//            System.out.println("Exception catch");
//        }
    }

    public void zeroExceptions() {
    }

    public void oneException() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }

    public void twoExceptions() throws IllegalArgumentException, InterruptedException {
    }
}
