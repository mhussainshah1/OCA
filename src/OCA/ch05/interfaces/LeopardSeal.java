package OCA.ch05.interfaces;

interface HasTail2 {

    public int getTailLength();
}

interface HasWhiskers2 {

    public int getNumberOfWhiskers();
}

abstract class HarborSeal implements HasTail2, HasWhiskers2 {
}

public class LeopardSeal implements HasTail2, HasWhiskers2 { // DOES NOT COMPILE
}
