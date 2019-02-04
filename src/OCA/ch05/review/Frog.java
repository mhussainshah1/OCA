package OCA.ch05.review;
interface CanHop {

}
public class Frog implements CanHop {

    public static void main(String[] args) {
        Frog frog = new TurtleFrog();
        TurtleFrog frog1 = new TurtleFrog();
        CanHop frog2 = new TurtleFrog();
        Object frog3 = new TurtleFrog();
    }
}
//3. Which of the following statements can be inserted in the blank line so that the code will
//compile successfully? (Choose all that apply)
//A. Frog
//B. TurtleFrog
//C. BrazilianHornedFrog
//D. CanHop
//E. Object
//F. Long