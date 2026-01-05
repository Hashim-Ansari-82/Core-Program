package Java_8;

import java.time.Instant;

public class InstantTime {
    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        System.out.println(l);

        Instant now = Instant.now();
        System.out.println(now);
    }
}
