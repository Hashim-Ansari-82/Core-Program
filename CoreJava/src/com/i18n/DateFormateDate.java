package com.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormateDate {
    public static void main(String[] args) {

        DateFormat India=DateFormat.getDateInstance(DateFormat.LONG,new Locale("En","In"));
        DateFormat Qatar=DateFormat.getDateInstance(DateFormat.MEDIUM,new Locale("En","Qa"));
        System.out.println("U S Style -----> "+ DateFormat.getDateInstance(1,Locale.US).format(new Date()));
        System.out.println("U K Style-----> "+ DateFormat.getDateInstance(1,Locale.UK).format(new Date()));
        System.out.println("ITALY Style -----> "+ DateFormat.getDateInstance(1,Locale.ITALY).format(new Date()));
        System.out.println("GERMAN Style -----> "+ DateFormat.getDateInstance(1,Locale.GERMAN).format(new Date()));
        System.out.println("Indian Style -----> "+India.format(new Date()));
        System.out.println("Qatar Style -----> "+Qatar.format(new Date()));

    }
}
