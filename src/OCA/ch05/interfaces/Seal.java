package OCA.ch05.interfaces;

interface HasTail1 {

    public int getTailLength();
}

interface HasWhiskers1 {

    public int getNumberOfWhiskers();
}

public interface Seal extends HasTail1, HasWhiskers1 {
}
