package OCA.ch04.pond.duck;

public class BadDuckling {

    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
