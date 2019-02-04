package OCA.ch06.TryStatement;

class AnimalsOutForAWalk extends RuntimeException {
}

class ExhibitClosed extends RuntimeException {
}

class ExhibitClosedForLunch extends ExhibitClosed {
}

public class MultipleException {

    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today");
        }
    }

    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {// subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) {// superclass exception
            System.out.print("not today");
        }

        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        } catch (ExhibitClosedForLunch e) {// DOES NOT COMPILE
            System.out.print("try back later");
        }
    }

    public void visitSnakes() {
        try {
            seeAnimal();
        } catch (RuntimeException e) {
            System.out.print("runtime exception");
        } catch (ExhibitClosed e) {// DOES NOT COMPILE
            System.out.print("not today");
        } catch (Exception e) {
            System.out.print("exception");
        }
    }

    private void seeAnimal() {
        throw new ExhibitClosed();
    }
}
