package com.logicalprogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArmstrongNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Number");
        int no1=Integer.parseInt(br.readLine());
        int no2=no1;
        int sum=0;
        while(no1!=0){
            int digit=no1%10;
              sum=sum+(digit*digit*digit);
              no1=no1/10;
        }
        if(sum==no2){
            System.out.println(sum+" is Armstrong Number");
        }
        else
            System.out.println(sum+" is not Armstrong Number");
    }
}
