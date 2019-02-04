package OCA.ch05.polymorphism;

interface Reptile1 {

    String getName();
//    public default String getName() {
//        return "Reptile";
//    }
}

class Alligator1 implements Reptile1 {

    @Override
    public String getName() {
        return "Alligator";
    }
}

class Crocodile1 implements Reptile1 {

    @Override
    public String getName() {
        return "Crocodile";
    }
}

public class ZooWorker1 {

    public static void feed(Reptile1 reptile) {
        System.out.println("Feeding reptile " + reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Alligator1());
        feed(new Crocodile1());
        feed(new Reptile1() {
                @Override
                public String getName() {
                    return "Reptile";
                }
        });
    }
}
