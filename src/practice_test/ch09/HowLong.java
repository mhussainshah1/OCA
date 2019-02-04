package practice_test.ch09;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HowLong {

    public static void main(String[] args) {
        //38
        LocalDate newYears = LocalDate.of(2017, 1, 1);
        Period period = Period.ofDays(1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.print(format.format(newYears.minus(period)));

        //45
        LocalDate newYears1 = LocalDate.of(2017, 1, 1);
        Period period1 = Period.ofDays(1);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("mm-dd-yyyy");//Runtime Error: 'mm' is wrong Format
        System.out.print(format1.format(newYears.minus(period)));
    }
}
