package Java_8;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate now=LocalDate.now();
        System.out.println(now);
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

        LocalDate customDate=LocalDate.of(2009,7,3);
        System.out.println(customDate);

    }
}
