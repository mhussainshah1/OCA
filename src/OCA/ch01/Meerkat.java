package OCA.ch01;// package must be first non-comment

import java.util.*; // import must come after package

//package structure; // DOES NOT COMPILE
//String name; // DOES NOT COMPILE
public class Meerkat { // then comes the class

    double weight; // fields and methods can go in either order

    public double getWeight() {
        return weight;
    }

    double height; // another field – they don't need to be together
}

class Paw {

}
