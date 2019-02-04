package enthuware.ch08;

public class TestClass3 {

    public static void main(String[] args) {
        try{
            hello();
        }
        catch(MyException me){
            System.out.println(me);
            me.printStackTrace();
        }
    }
    
    static void hello() throws MyException{
        int[] dear = new int[7];
        dear[0] = 747;
        foo();
    }
    
    static void foo() throws MyException{
        throw new MyException("Exception from foo");
    }
}