package OCA.ch01.review;

public class Price {

    public void admission() {
//        int amount = 0b101;//5
//        int amount = 0xE;//14
//        double amount = 0xFF;//14.0
        int amount = 0b11;//3
        System.out.println(amount);
    }

    public static void main(String[] args) {
        new Price().admission();
    }
}
