package OCA.ch05.review;
interface HasExoskeleton {

    abstract int getNumberOfSections();
}
abstract class Insect implements HasExoskeleton {

    abstract int getNumberOfLegs();
}
public class Beetle extends Insect {

    int getNumberOfLegs() {
        return 6;
    }
}
