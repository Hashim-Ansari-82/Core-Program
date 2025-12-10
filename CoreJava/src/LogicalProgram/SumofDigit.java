package LogicalProgram;

import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Multiple Number");
        int b=sc.nextInt();
        int sum=0;
        while(b>0){
            sum=sum+b%10;
            b=b/10;
        }
        System.out.println("Sum Of Digit = "+sum);
    }
}
