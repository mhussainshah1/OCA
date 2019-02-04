package practice_test.ch02;
//Program Order

public class InitOrder {

    public String first = "instance";           //3

    public InitOrder() {                        //2
        System.out.println(first = "constructor");//5
    }                                           //6

    {
        System.out.println(first = "block");
    }    //4

    public void print() {                       //7
        System.out.println(first);              //8
    }                                           //9

    public static void main(String... args) {   //START
        new InitOrder().print();                //1
    }
}
