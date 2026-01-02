package com.arrayprogram;

public class Shift1To9AtLast {
    public static void main(String[] args) {
       int[] a={23,4,5,6,78,9,90,1,2,34,56};
       int[] temp=new int[a.length];
       int index=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<1 || a[i]>9){
                temp[index++]=a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=1 && a[i]<=9){
                temp[index++]=a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            a[i]=temp[i];
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
