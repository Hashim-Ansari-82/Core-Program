package com.map;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException, SQLException {

        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("db.properties");
        p.load(fis);
        String url=p.getProperty("url");
        String user=p.getProperty("user");
        String pwd=p.getProperty("pwd");
        Connection c= DriverManager.getConnection(url,user,pwd);


    }
}
