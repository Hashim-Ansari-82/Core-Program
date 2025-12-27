package com.i18n;
import java.text.*;
import java.util.Locale;

public class NumberFormateNo {
      public static void main(String[] args)  {
		
    	  double d=12343423422.4543;
    	  
    	  NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
    	  System.out.println("ITALY Form is : "+nf.format(d));

          Locale l=new Locale("en","In");
          NumberFormat nf1=NumberFormat.getInstance(l);
          System.out.println("INDIA Form is : "+nf1.format(d));

          NumberFormat nf2=NumberFormat.getInstance(Locale.US);
          System.out.println("US Form is : "+nf2.format(d));

          Locale Qatar=new Locale("ar","Qa");
          NumberFormat nf3=NumberFormat.getInstance(Qatar);
          System.out.println("Qatar Form is : "+nf3.format(d));

          NumberFormat nf4=NumberFormat.getInstance(Locale.UK);
          System.out.println("U K Form is : "+nf4.format(d));
      }
}
