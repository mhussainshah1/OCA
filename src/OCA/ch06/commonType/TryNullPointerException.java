package OCA.ch06.commonType;

public class TryNullPointerException {

    String name;

    public void printLength() throws NullPointerException {
        System.out.println(name.length());
    }

    public static void main(String[] args) {
        new TryNullPointerException().printLength();
    }
}
