package practice_test.ch06.jungle;

public class RainForest extends Forest {

    public RainForest(long treeCount) {
        //Compiler inserts no argument constructor to the first line.        
        //super(); //Error: parent class doesn't have no argument constructor
        this.treeCount = treeCount + 1;
    }

    public static void main(String[] birds) {
        System.out.print(new RainForest(5).treeCount);
    }
}
