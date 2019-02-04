package OCA.ch05.inheritance;

class Animal5 extends Object {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }
}

public class Rabbit extends Animal5 {

    public Rabbit(int age) {
        super();
        super.setAge(10);
    }
}
