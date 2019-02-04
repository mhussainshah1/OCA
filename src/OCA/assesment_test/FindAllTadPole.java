package OCA.assesment_test;

import java.util.ArrayList;
import java.util.List;

interface CanSwim {
}

class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

public class FindAllTadPole {

    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<>();
        for (Amphibian amphibian : tadpoles) {
            CanSwim tadpole1 = amphibian;
            Amphibian tadpole2 = amphibian;
            Tadpole tadpole3 = (Tadpole) amphibian;
            Object tadpole4 = amphibian;
        }
    }
}
