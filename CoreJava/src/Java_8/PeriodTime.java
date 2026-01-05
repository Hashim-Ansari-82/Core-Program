package Java_8;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTime {
    public static void main(String[] args) {

        LocalDate now=LocalDate.now();
        LocalDate then = LocalDate.of(2005, 1, 9);
       // LocalDate then = LocalDate.of(2026, 1, );
        Period between = Period.between(now, then);
        System.out.println(between);
    }
}
