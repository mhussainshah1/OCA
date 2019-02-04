package enthuware.Test1;

class Super {  }
class Sub extends Super {  }
class TestClass38{
   public static void main(String[] args){
      Super s1 = new Super(); //1
      Sub s2 = new Sub();     //2
      s1 = (Super) s2;        //3
   }
}