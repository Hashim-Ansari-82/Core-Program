package com.i18n;
import java.util.*;

public class LocaleDemo {
   public static void main(String[] args) {
	  int count=0;
	  int num=0;
	  int co=0;
	   Locale l=Locale.getDefault();
	   System.out.println(l.getCountry()+" ...... "+l.getLanguage());
	   System.out.println(l.getDisplayCountry()+" ...... "+l.getDisplayLanguage());
	   
	   Locale l1=new Locale("pn","IN");
	   Locale.setDefault(l1);
	   System.out.println(Locale.getDefault().getDisplayLanguage());
    
	   System.out.println("ISO Countries");
	   String[] s=Locale.getISOCountries();
	   for(String s1:s) {
		   System.out.println(++count+"---->"+s1);
	   }
	   System.out.println("ISO Languages");
	   String[] s2=Locale.getISOLanguages();
	   for(String s3:s2) {
		   System.out.println(++num+"---->"+s3);
	   }
	   Locale[] l3=Locale.getAvailableLocales();
	   for(Locale l4:l3) {
		   System.out.println(++co+"---->"+l4.getDisplayCountry()+" ------> "+l4.getDisplayLanguage());
	   }
   }
}
