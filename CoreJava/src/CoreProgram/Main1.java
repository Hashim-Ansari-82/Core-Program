package CoreProgram;

class InvaliAgeExceptio extends RuntimeException{
	InvaliAgeExceptio(String masg){
		super(masg);
	}
}
class Main1{
	 void show(){
		 int age=17;
		 if(age<18){
			 System.out.println("You Are Eligible...");
		 }
		 else{
			 System.out.println("Sorry....");
		 }
		 
	 }
	
}
class Test {
    public static void main(String[] args){
		 Main1 m=new Main1();
		 m.show();
	 }  
			 
}