package practice_test.ch08;

public class Stranger {

    public static String getFullName(String firstName, String lastName) {
        try {
            return firstName.toString() + " " + lastName.toString();
        } finally {
            System.out.print("Finished!");
        }catch (NullPointerException npe) {
         System.out.print("Problem?");
      }
        return null;
    }

    public static void main(String[] things) {
        System.out.print(getFullName("Joyce", "Hopper"));
    }
}
