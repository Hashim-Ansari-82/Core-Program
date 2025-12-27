package com.garbagecollector;

public class JvmRunGC {
    static int count=0;
    public static void main(String[] args) {

        for (int i = 1; i <=1000000; i++) {
            JvmRunGC j=new JvmRunGC();
           j=null;
        }
    }
        public void finalize(){

            System.out.println("Finalize Method Call " + ++count);
        }

}
