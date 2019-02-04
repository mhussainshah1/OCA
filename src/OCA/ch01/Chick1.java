package OCA.ch01;

public class Chick1 {                                   //Order of Execution

    private String name = "Small";                                      //4

    public Chick1() {                                                   //3
        name = "Tiny";                                                  //10
        System.out.println("in Contructor " + name);                    //11
    }                                                                   //12

    {                                                                   //5
        System.out.println(name);                                       //6
        name = "Fluffly";                                               //7
        System.out.println("in initialization Block " + name);          //8
    }                                                                   //9

    public static void main(String[] args) {                            //1
        Chick1 chick = new Chick1();                                    //2 
        System.out.println("In Main Method " + chick.name);             //13
    }
}
