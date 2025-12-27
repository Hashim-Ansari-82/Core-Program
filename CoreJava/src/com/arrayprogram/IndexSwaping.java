package com.arrayprogram;

public class IndexSwaping {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6,4,3,5,5,66,6,54};
        System.out.println("\n <---- Before Swaping ----->\n");
        for(int i:a){
            System.err.print(i+" ");
        }
        for(int i=0; i<a.length-1; i+=2){

                int tem=a[i];
                 a[i]=a[i+1];
                 a[i+1]=tem;
        }
        System.err.println("\n \n<---- After Swaping ------>\n");
        for(int i:a){
            System.err.print(i+" ");
        }

    }
}
