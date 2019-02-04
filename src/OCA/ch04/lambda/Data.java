package OCA.ch04.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Data {

    int value;

    Data(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public static void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
        Iterator<Data> i = dataList.iterator();
        while (i.hasNext()) {
            if (p.test(i.next())) {
                i.remove();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Data> al = new ArrayList<>();
        Data d = new Data(1);
        al.add(d);
        d = new Data(2);
        al.add(d);
        d = new Data(3);
        al.add(d);
        //INSERT METHOD CALL HERE        
        filterData(al, (Data x) -> x.value % 2 == 0);
        filterData(al, d -> d.value%2 == 0 );
        System.out.println(al);
    }
}
