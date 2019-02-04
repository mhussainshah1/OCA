package enthuware.ch06;

class Wrapper {

    int num = 10;
}

public class TestClass {

    static Wrapper changeWrapper(Wrapper w) {
        w = new Wrapper();
        w.num += 9;
        return w;
    }

    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        w.num = 20;
        changeWrapper(w);
        w.num += 30;
        System.out.println(w.num);
        w = changeWrapper(w);
        System.out.println(w.num);
    }
}
