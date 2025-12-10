package CoreProgram;

class Animal{
    Object print(){
        System.out.println("Get A Rabbit");
        return this;
    }
}
class Goat extends Animal{
  Integer print(){
        System.out.println("Print Integer Number");
        return (2);
       }
      }  

class Covarient {
    public static void main(String args[]){
        Goat g = new Goat();
          g.print();
         Animal  a = new Goat();
         a.print();
    }  
}