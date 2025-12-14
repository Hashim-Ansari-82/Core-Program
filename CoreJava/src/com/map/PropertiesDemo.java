package com.map;

import java.io.*;
import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {

        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("abc.properties");
        p.load(fis);
        System.out.println(p);
        String s=p.getProperty("user");
        System.out.println(s);
        p.setProperty("12","Qasim");
        FileOutputStream fos=new FileOutputStream("abc.properties");
       p.store(fos,"update By Mohammad Hashim by Java Developer");

    }
}
