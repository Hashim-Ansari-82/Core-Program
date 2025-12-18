package com.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormateDateAndTime {
    public static void main(String[] args) {

        DateFormat India=DateFormat.getDateTimeInstance();
        DateFormat Qatar=DateFormat.getDateTimeInstance(DateFormat.LONG,2);
        System.out.println("U S Style -----> "+ DateFormat.getDateTimeInstance(1,2).format(new Date()));
        System.out.println("U K Style-----> "+ DateFormat.getDateTimeInstance(1,2).format(new Date()));
        System.out.println("ITALY Style -----> "+ DateFormat.getDateTimeInstance(1,2).format(new Date()));
        System.out.println("GERMAN Style -----> "+ DateFormat.getDateTimeInstance(1,2).format(new Date()));
        System.out.println("Indian Style -----> "+India.format(new Date()));
        System.out.println("Qatar Style -----> "+Qatar.format(new Date()));

    }
}
