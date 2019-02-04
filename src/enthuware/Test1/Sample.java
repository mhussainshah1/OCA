package enthuware.Test1;

public class Sample implements IInt {
    private Sample(){
        
    }
    public static void main(String[] args) {
        Sample s = new Sample();  //1       
        int j = s.thevalue;       //2       
        int k = IInt.thevalue;    //3       
        int l = thevalue;         //4
        int m = this.thevalue;
    }
}

interface IInt {

    int thevalue = 0;
}
