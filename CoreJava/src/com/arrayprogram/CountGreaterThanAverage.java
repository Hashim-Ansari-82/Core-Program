package com.arrayprogram;

import java.util.Locale;

public class CountGreaterThanAverage {

    public static int count(int[] a) {
        int sum = a[0];
        int count = 0;
        int n = 1;
        for (int i = 1; i < a.length; i++) {

            int ave =  sum/n;
            count++;

            if (a[i] > ave) {
                n++;
            }
            sum += a[i];
        }
        return count;
    }
    public static void main(String[] args) {

        int[] a={1,3,4,6,8};
        System.out.println(count(a));

    }
}
