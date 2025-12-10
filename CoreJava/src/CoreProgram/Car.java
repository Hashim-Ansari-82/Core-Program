package CoreProgram;

class Car{
    String brand;
    int speed;
     public void setBrand(String brand){
	  this.brand = brand;
	 }
	 public String getBrand(){
		 return brand;
	 }
	 public void setSpeed( int speed){
		 this.speed=speed;
	 }
	 public int getSpeed(){
		 return speed;
	 }
		 
	//public void  detail(){
	   //System.out.println("Brand : "+brand);
	  // System.out.println("Speed : "+speed);
	     
	   public static void main (String[] args){
	       Car c = new Car();
		   c.setBrand("Tata");
		   c.setSpeed(87);
		  System.out.println(c.getBrand());
		  System.out.println(c.getSpeed());
	   }
	 
  }