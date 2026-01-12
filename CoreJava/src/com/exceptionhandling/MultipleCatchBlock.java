package com.exceptionhandling;

public class MultipleCatchBlock {
        public static void main(String[] args) {

            try{
//                Object o=new Object();
//                String s=(String)o;
                String s=null;
                System.out.println(s.length());
            }
            catch(ArithmeticException|NullPointerException|ClassCastException e){
                e.printStackTrace();
            }

        }
}
