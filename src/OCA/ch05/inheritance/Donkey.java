package OCA.ch05.inheritance;

class Animal4 {
    public Animal4() {
        System.out.println("No argument constructor");
    }
}

public class Donkey extends Animal4{
    //Java Compiler automatically insert the following if you have no constructor
//    public Donkey(){
//        super();
//    }
    public static void main(String[] args) {
        new Donkey();
    }
}
