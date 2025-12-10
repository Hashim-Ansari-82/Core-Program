package CoreProgram;

import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your Name");
    
    String name = sc.nextLine();
    
    System.out.println("Enter your Age");
    
    int age = sc .nextInt();
    
    System.out.println("Enter your Favourite Number");
    
    int number = sc.nextInt();
    
    System.out.println("Enter Your Marks");
    
    float marks = sc.nextFloat();
    
    System.out.println("Thanks for Providing Detail");
    
    System.out.println("Your Name is  "+name);
    
    System.out.println("Your Age is "+age);
    
    System.out.println("Enter Your Favourite Number"+number);
    
    System.out.println("Enter your Marks"+marks);
    sc.close();
	}

}
