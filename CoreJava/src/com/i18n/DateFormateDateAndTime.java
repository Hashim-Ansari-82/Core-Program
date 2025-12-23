package com.i18n;

import java.text.DateFormat;
import java.util.Date;

public class DateFormateDateAndTime {
    public static void main(String[] args) {

        DateFormat India=DateFormat.getDateTimeInstance();
        DateFormat Qatar=DateFormat.getDateTimeInstance();
        System.out.println(" U S Style -------> " + DateFormat.getDateTimeInstance().format(new Date()));
        System.out.println(" U K Style  ------> " + DateFormat.getDateTimeInstance().format(new Date()));
        System.out.println(" ITALY Style -----> " + DateFormat.getDateTimeInstance().format(new Date()));
        System.out.println(" GERMAN Style ----> " + DateFormat.getDateTimeInstance().format(new Date()));
        System.out.println(" Indian Style ----> " + India.format(new Date()));
        System.out.println(" Qatar Style -----> " + Qatar.format(new Date()));

    }
}
