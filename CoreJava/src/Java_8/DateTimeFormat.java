package Java_8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateTimeFormat {
    public static void main(String[] args) {

        String date="12/12/2009";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse);
    }
}
