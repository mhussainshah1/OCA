package practice_test.ch03;

public class NameCheck {

    //3
    public static void main(String... data) {
        String john = "john";
        String jon = new String(john);
        System.out.print((john == jon) + " " + (john.equals(jon)));
    }
}
