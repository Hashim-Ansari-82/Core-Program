package com.oops.encapsulation;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Account{
   private double balance;
    public void checkBalance(){
        System.out.println("Your Current balance : "+balance);
    }
    public  void deposits(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount");
        double amount=sc.nextDouble();
        if(amount >0 && balance<0){
           balance += amount;
        }
        else {
            System.out.println("wrong balance");
        }
    }
    public  void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount");
        double amount=sc.nextDouble();
        if(amount>0 && balance>amount){
            balance-=amount;
        }
        else {
            System.out.println("insufficient balance");
        }
    }

}

public class EncapsulationDemo {

    public static void main(String[] args) throws Exception{
        Account a = new Account();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             int option;
      do {
          System.out.println("Choose an option");
          System.out.println("1. Check Balance \t2. Withdraw Money \n3. Deposite Amount\t4. Exit");
          option=Integer.parseInt(br.readLine()) ;

          switch (option){
              case 1:
                  a.checkBalance();
                  break;
              case 2:
                  a.withdraw();
                  break;
              case 3:
                  a.deposits();
                  break;
              default:
                  System.out.println("invalid choice ");
          }
      }while (option!=4);
    }
}
