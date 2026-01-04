package Java_8;


import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {

      LocalTime now= LocalTime.now();
        System.out.println(now);

        int minute = now.getMinute();
        int hour = now.getHour();
        int second = now.getSecond();
        int nano = now.getNano();
        System.out.println(hour+"\n"+minute+"\n"+second+"\n"+nano);

        LocalTime customTime = LocalTime.of(14, 20, 30);
        System.out.println(customTime);
    }
}
