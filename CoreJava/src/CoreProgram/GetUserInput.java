package CoreProgram;

import java.util.Scanner;

public class GetUserInput {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Name");

		String name = scanner.nextLine();

		System.out.println("Inter Your Age");

		int age =scanner .nextInt();

		System.out.println("Enter Your Marks");

		float marks = scanner.nextFloat();

		System.out.println("Thanks For Providing Detail");

		System.out.println("Hello " +name+ " Your Age is  " +age+" And Your marks is  " + marks);
     scanner.close();
	}
};
