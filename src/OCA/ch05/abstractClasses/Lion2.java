package OCA.ch05.abstractClasses;

abstract class Animal5 {

    protected abstract String getName();
    public static int a = 0;
}

abstract class BigCat2 extends Animal5 {

    public String getName() {
        return "BigCat";
    }

    public abstract void roar();
}

public class Lion2 extends BigCat2 {

    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
