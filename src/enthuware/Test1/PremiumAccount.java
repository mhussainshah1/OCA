package enthuware.Test1;

interface Account {

    public default String getId() {
        return "0000";
    }
}

interface PremiumAccount extends Account {    //INSERT CODE HERE 

    String getId();
}
