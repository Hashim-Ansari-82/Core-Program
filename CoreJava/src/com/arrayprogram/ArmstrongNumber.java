package com.arrayprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any 3 digit Number");
        int i=Integer.parseInt(br.readLine());
        int i1=i;
        int sum=0;
        while(i>0){
            int digit=i%10;
            sum+=(digit*digit*digit);
            i=i/10;
        }
        if(i1==sum){
            System.out.println(sum+" is Armstrong number");
        }
        else
            System.out.println(sum+" is not Armstrong number");
    }
}
