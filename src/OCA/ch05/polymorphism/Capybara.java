package OCA.ch05.polymorphism;

class Rodent {
}

public class Capybara extends Rodent {

    public static void main(String[] args) {
        Capybara capybara = new Capybara();
        Rodent rodent1 = capybara; //UP CASTING
        Capybara capybara1 = (Capybara) rodent1;//DOWN CASTING

        Rodent rodent2 = new Rodent();
        Capybara capybara2 = (Capybara) rodent2; // Throws ClassCastException 
        //at runtime becaue rodents does't have an instance of capybara.

        if (rodent2 instanceof Capybara) {
            capybara2 = (Capybara) rodent2;
        }
    }
}
