package enthuware.Test1;

interface Bozo {

    int type = 0;

    public void jump();
}

public class Type1Bozo implements Bozo {

    public Type1Bozo() {
        type = 1;
    }

    public void jump() {
        System.out.println("jumping..." + type);
    }

    public static void main(String[] args) {
        Bozo b = new Type1Bozo();
        b.jump();
    }
}
