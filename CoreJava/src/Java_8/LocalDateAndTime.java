package Java_8;


import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateAndTime {
    public static void main(String[] args) {

      LocalDateTime now= LocalDateTime.now();
        System.out.println(now);
        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
    }
}
