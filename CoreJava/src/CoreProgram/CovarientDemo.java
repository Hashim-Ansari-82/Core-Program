package CoreProgram;

class A2 {
   Object print() {
	   System.out.println("Give me My Pen");
	   return this;
   }
}
class B2 extends A2{
	Integer print() {
		System.out.println("12312");
		return (2);
	}
}
public class CovarientDemo {
     public static void main(String[] args) {
        A2 a = new B2();
         a.print();
         B2 b = new B2();
         b.print();
	}
}
