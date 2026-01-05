package Java_8;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DurationTime {
    public static void main(String[] args) {

        Instant start = Instant.now();
        int sum=0;
        for (int i = 0; i < 1234567876; i++) {
            sum+=i;
        }
        System.out.println(sum);
        Instant end = Instant.now();
        Duration between = Duration.between(start, end);
        Duration duration = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(between);
        System.out.println(duration);
    }
}
