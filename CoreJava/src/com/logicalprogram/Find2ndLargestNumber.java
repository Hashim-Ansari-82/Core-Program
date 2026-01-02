package com.logicalprogram;

public class Find2ndLargestNumber {
    public static void main(String[] args) {
        int a=35;
        int b=54;
        int c=67;
        if((a>b && a<c)|| (a<b && a>c)){
            System.out.println(a+" is 2nd Largest Number");
        }
        else if ((b>a && b<c) || (a<a && b>c)) {
            System.out.println(b+" is 2nd Largest Number");
        }
        else
            System.out.println(c+" is 2nd Largest Number");
    }
}
