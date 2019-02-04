package practice_test.ch08;

public class SpecificException {

    public static void main(String[] args) {
        final Object exception = new Exception();
        final Exception data = (RuntimeException) exception;
        System.out.print(data);
    }
}
