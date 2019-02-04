package OCA.ch05.interfaces;

interface CanRun {
}

class Cheetah extends CanRun {
} // DOES NOT COMPILE

public class Hyena {
}

interface HasFur extends Hyena {
} // DOES NOT COMPILE
