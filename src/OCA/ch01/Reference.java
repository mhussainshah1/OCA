package OCA.ch01;

import java.util.Date;

public class Reference {

    Date today;
    String greeting;

    {
        today = new Date();
        greeting = "How are you?";
    }

    //int value = null; // DOES NOT COMPILE
    String s = null;
    String reference = "hello";
    int len = reference.length();
    //int bad = len.length(); // DOES NOT COMPILE
}
