package OCA.ch04.lambda;

public class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }
}
