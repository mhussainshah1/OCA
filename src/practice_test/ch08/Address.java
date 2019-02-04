/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package practice_test.ch08;

public class Address {

    public String getAddress(String street, String city) {
        try {
            return street.toString() + " - " + city.toString();
        } finally {
            System.out.print("Posted:");
        }
    }

    public static void main(String[] form) {
        String street = "350 5th Ave";
        String city = "New York";
        System.out.print(new Address().getAddress(street, city));
    }
}
