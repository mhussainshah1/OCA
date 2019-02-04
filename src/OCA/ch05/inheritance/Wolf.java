package OCA.ch05.inheritance;

class Canine {

    public double getAverageWeight() {
        return 50;
    }
}

public class Wolf extends Canine {

    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
        //return getAverageWeight()+20; // INFINITE LOOP
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}
