package enthuware.Test;

class Test {

    public static int[] getArray() {
        return null;
    }

    public static void main(String[] args) {
        int index = 1;
        try {            
            getArray()[index = 2]++;
        } catch (Exception e) {
            System.out.println(e);
        }  //empty catch       
        System.out.println("index = " + index);
        
        
        char[][] cA ={{'a','b','c'},{ 'a', 'b', 'c' }};
        char cA1[][] = new char[3][];   
        for (int i=0; i<cA1.length; i++) cA1[i] = new char[4]; 
        char cA2[][] = { new char[ ]{ 'a', 'b', 'c' }  ,   new char[ ]{ 'a', 'b', 'c' }  };
    }
}
