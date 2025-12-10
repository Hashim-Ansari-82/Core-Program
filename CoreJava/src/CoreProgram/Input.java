package CoreProgram;

import java.util.Scanner;

class Input {
   public static void main (String[] args)
   {
	 
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Your Name");
	 String name = sc.nextLine();
	 System.out.println("Enter Your rollno");
	 int rollno = sc.nextInt();
	 System.out.println("Enter Your Marks");
	 float marks = sc.nextFloat();
	 System.out.println("Enter Your Choice");
	 char c = sc.next().charAt(0);
	 System.out.println("Thanks For Providing Detail");
	 System.out.println("Your Name Is : "+name);
	 System.out.println("Your Roolno Is : "+rollno);
	 System.out.println("Your Marks Is : "+marks);
	 System.out.println("Your Choice Is : "+c);
   }
}