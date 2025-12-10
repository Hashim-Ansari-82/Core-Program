package CoreProgram;

class LeapYear{
   public static void main(String[] args){
         int a=2020;
		 if(a%4==0 && a%400==0 || a%100!=0){
		  System.out.print(a+" is leap year");
		 }
		 else{
		  System.out.println(a+" Is not a Leap Year");
		 }
   }
}