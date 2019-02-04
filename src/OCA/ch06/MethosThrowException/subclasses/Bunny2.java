package OCA.ch06.MethosThrowException.subclasses;

class CanNotHopException2 extends Exception {
}

class Hopper2 {

    public void hop() throws Exception {
    }
}

class Bunny2 extends Hopper2 {

    public void hop() throws CanNotHopException2 {
    }
}
