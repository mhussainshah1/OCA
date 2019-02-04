package OCA.assesment_test;

import java.util.ArrayList;
import java.util.List;

class Chicken {

    String name;

    Chicken(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

interface HenHouse {

    public List<Chicken> getChickens();
}

class FarmHouse implements HenHouse {

    @Override
    public List<Chicken> getChickens() {
        List<Chicken> list = new ArrayList<>();
        list.add(new Chicken("Black"));
        list.add(new Chicken("White"));
        return list;
    }
}

public class ChickenSong {

    public static void main(String[] args) {
        HenHouse house = new FarmHouse();
        List<Chicken> list = house.getChickens();
        Chicken chicken = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "Cluck");
        }
    }
}
