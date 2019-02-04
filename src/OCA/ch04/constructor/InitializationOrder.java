package OCA.ch04.constructor;
public class InitializationOrder {
    private String name = " Torchie ";
    {
        System.out.print(name);
    }

    private static int COUNT = 0;
    static {
        System.out.print(++COUNT);
    }

    {
        System.out.print(++COUNT);
    }

    public InitializationOrder() {
        System.out.println(" constructor");
    }

    public static void main(String[] args) {
        //System.out.println("read to construct");
        System.out.println(COUNT);
        System.out.println(COUNT);
        new InitializationOrder();
        new InitializationOrder();
    }
}