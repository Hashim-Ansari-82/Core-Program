package com.arrayprogram;

public class IndexSwap {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,4,3,5,5,66,6,54};
        System.out.println("\n<---- Before Changing ----->\n");
        for(int i:a){
            System.out.print(i+" ");
        }
        for(int i=0; i<a.length-1; i+=2){

                int tem=a[i];
                 a[i]=a[i+1];
                 a[i+1]=tem;
        }
        System.out.println("\n \n<---- After Changing ------>\n");
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
