package com.i18n;
import java.util.*;
import java.text.*;

public class NumberFormateCurrency {
       public static void main(String[] args) {
		 
    	   double d=122323.223;
    	   Locale india=new Locale("Pa","IN");
    	   NumberFormat nf1=NumberFormat.getCurrencyInstance(india);
    	   System.out.println("INDIAN Currency : "+nf1.format(d));
    	   
    	   NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.US);
    	   System.out.println("US Currency : "+nf2.format(d));
    	   
    	   NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.UK);
    	   System.out.println("UK Currency : "+nf3.format(d));

           NumberFormat nf4=NumberFormat.getCurrencyInstance(Locale.CHINESE);
           System.out.println("CHINESE Currency : "+nf4.format(d));

           NumberFormat nf5=NumberFormat.getCurrencyInstance(Locale.CHINA);
           System.out.println("CHINA Currency : "+nf5.format(d));

           NumberFormat nf6=NumberFormat.getCurrencyInstance(Locale.ENGLISH);
           System.out.println("ENGLISH Currency : "+nf6.format(d));

           Locale Qatar=new Locale("arb","Qa");
           NumberFormat nf7=NumberFormat.getCurrencyInstance(Qatar);
           System.out.println("QATAR Currency : "+nf7.format(d));

           Locale Pak=new Locale("arb","Pa");
           NumberFormat nf8=NumberFormat.getCurrencyInstance(Pak);
           System.out.println("Pakistan Currency : "+nf8.format(d));
	}
}
