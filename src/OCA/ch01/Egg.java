package OCA.ch01;

public class Egg {

    public Egg() {                                  //3
        number = 5;                                 //8
    }                                               //9

    public static void main(String[] args) {        //1               
        Egg egg = new Egg();                        //2
        System.out.println(egg.number);             //10
    }
    private int number = 3;                         //4

    {                                               //5
        number = 4;                                 //6
    }                                               //7
}
