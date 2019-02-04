package practice_test.ch08;

class PrintException extends Exception {
}

class PaperPrintException extends PrintException {
}

interface Printer {

    abstract int printData() throws PrintException;
}

public class HP implements Printer {

//    public int printData() throws PaperPrintException {
//        return 0;
//    }    
    @Override
    public int printData() throws Exception {
        return 0;
    }

//    public int printData() {
//        return 0;
//    }    
}
