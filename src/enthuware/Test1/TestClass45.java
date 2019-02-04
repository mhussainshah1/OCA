package enthuware.Test1;

class Base1{
   public short getValue(){ return 1; } //1
}
class Base21 extends Base1{
   public byte getValue(){ return 2; } //2
}
public class TestClass45{
   public static void main(String[] args){
      Base1 b = new Base21();
      System.out.println(b.getValue()); //3
   }
   private final static class C1{
       
   }
}