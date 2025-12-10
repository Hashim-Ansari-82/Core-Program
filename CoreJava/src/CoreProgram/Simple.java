 package CoreProgram;
 
 interface A3{
    void sum();
}
public class Simple implements A3{
 public void sum(){
    System.out.println("Hello sum method:");
 }
public static void main(String[] args) {

    A3 s=new Simple();
    s.sum();
}
}


