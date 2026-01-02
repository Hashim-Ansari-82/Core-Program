package com.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Greeting {


        public static void main(String[] args) {

            // English
            Locale enLocale = new Locale("en","US");
            ResourceBundle eBundle = ResourceBundle.getBundle("com.i18n.Messages", enLocale);
            System.out.println("English:");
            System.out.println(eBundle.getString("greeting"));
            System.out.println(eBundle.getString("farewell"));
            System.out.println("--------------------");

            // Hindi
            Locale hiLocale = new Locale("hi","IN");
            ResourceBundle hBundle = ResourceBundle.getBundle("com.i18n.Messages", hiLocale);
            System.out.println("Hindi:");
            System.out.println(hBundle.getString("greeting"));
            System.out.println(hBundle.getString("farewell"));
        }


}
