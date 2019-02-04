package OCA.ch06.commonType;

public class TryExceptionInIntializerError {

    static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }

    public static void main(String[] args) {
    }
}
