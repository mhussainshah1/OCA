package practice_test.ch09;

import java.time.LocalDate;
import java.time.Period;

public class MyDateTime {

    public static void main(String[] args) {
        //32
        LocalDate xmas = LocalDate.of(2016, 12, 25);//LocalDate is immutable
        xmas.plusDays(-1);
        System.out.println(xmas.getDayOfMonth());

        //50
        LocalDate xmas1 = LocalDate.of(2016, 12, 25);
        //xmas1.setYear(2017);//Error: Can't find method setYear()
        System.out.println(xmas1.getYear());

        //37
        Period period1 = Period.ofWeeks(1).ofDays(3);
        Period period2 = Period.ofDays(10);
        System.out.println(period1 + "\n" + period2);

    }
}
