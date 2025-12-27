<<<<<<< HEAD
package com.arrayprogram;
=======
package ArrayDemo;
>>>>>>> f3e1def09101a6122c098c4ca4c25b0cf7fc45bf

class AnnonymousArray{
    public static void main(String[] args) {
    	
        sum(new int[]{10,20,30,40});
    }
    static void sum(int[] s){
        int total=0;
        for(int x:s){
            total=total+x;
        }
        System.out.println(total);
    }
}
