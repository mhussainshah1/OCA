package enthuware.standard_test;

import java.util.function.Predicate;

interface Automobile { String describe(); }

class FourWheeler implements Automobile{
   String name;
   @Override
   public String describe(){ return " 4 Wheeler " + name; }
}

class TwoWheeler extends FourWheeler{
    String name;
    @Override
    public String describe(){ return " 2 Wheeler " + name; }
    
    public static void main(String[] args) {
        FourWheeler tw = new TwoWheeler();
        Automobile ab = new TwoWheeler();
        int[] a = new int[0];
        String[] str = new String[0];
        
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");
//        b1.append(b2.substring(2,5).toUpperCase());
//        b2.insert(3, b1.append("a"));
        b1.replace(3,4,b2.substring(4)).append(b2.append(false));
        System.out.println(b1.toString() +"\n" +
                b2.toString());
        Predicate p;        
    }
}