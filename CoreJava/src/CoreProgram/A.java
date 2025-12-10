package CoreProgram;

import java.util.Scanner;
 
 class A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     
      /* System.out.println("Enter you Name ");
       String name=sc.next();
     */
        System.out.println("Enter you age ");
        int age = sc.nextInt();

         System.out.println("Enter you marks ");
         float marks = sc.nextFloat();

        System.out.println(" Your Age is  " +age+ " And your marks is "+marks);
         sc.close();
    } 
}
