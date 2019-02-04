package practice_test.ch07;

import java.util.Random;

abstract class House {

    protected abstract Object getSpace();
}

abstract class Room extends House {

    //Overloaded method
    abstract Object getSpace(Object list);
}

abstract public class Ballroom extends House {

    protected abstract Object getSpace();

    public static void main(String[] squareFootage) {
        Random r = new Random();
        System.out.print("Let's start the party!");
    }
}
