package CoreProgram;

class Overload{
    void show(Object a){
	  System.out.println("Hii");
	}
	void show(String s){
	  System.out.println("Byy");
	}
	public static void main(String[] args){
	Overload o=new Overload();
	o.show(null);
	}
}