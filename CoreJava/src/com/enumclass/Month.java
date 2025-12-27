package com.enumclass;

import java.util.Scanner;

public enum Month {
    Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec;
}

class MonthDemo{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter month Jan to Dec");
        String input=Sc.next();
        Month m=Month.valueOf(input);

        switch(m){
            case Nov:
            case Dec:
            case Jan:
            case Feb:
                System.out.println("Winter Season");
                break;
            case Mar:
            case Apr:
            case May:
            case Jun:
                System.out.println("Summer Season");
                break;
            case Jul:
            case Aug:
            case Sep:
            case Oct:
                System.out.println("Rainy Season");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        Month[]  m1=Month.values();
        for(Month m2:m1){
            System.out.println(m2+"......"+m2.ordinal());
        }

    }
}
