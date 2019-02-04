package OCA.ch05.abstractClasses;

abstract class Animal4 {

    public abstract String getName();
}

abstract class BigCat1 extends Animal4 {

    public abstract void roar();
}

public class Lion1 extends BigCat1 {

    public String getName() {
        return "Lion";
    }

    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
