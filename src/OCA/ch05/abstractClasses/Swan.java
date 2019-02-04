package OCA.ch05.abstractClasses;

abstract class Animal1 {

    protected int age;

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract String getName();
}

public class Swan extends Animal1 {

    public String getName() {
        return "Swan";
    }
}
