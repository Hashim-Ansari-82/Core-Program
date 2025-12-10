package CoreProgram;

class Account1{
    private String name;
	private String email;
	 private long acc_no;
	 private double balance;
	
	 public String getName(){
	   return name;
	 }	 
	 public void setName(String name){
	   this.name = name;
	 }
	 public String getEmail(){
	   return email;
	 }
	 public void setEmail(String email){
       this.email = email;	   
	 }
	 public long getAcc_no(){
	   return acc_no;
	 }
	public void setAcc_no(long acc_no ){
	  this.acc_no = acc_no ;
	}
	public double getBalance(){
	  return balance;
	}
	public void setBalance(double balance){
      this.balance = balance;	  
	}
}
  class MainClass{
	  public  static  void  main (String args[]){
    Account a=  new Account();
	a.setName("Hashim Ansari");
	a.setEmail("mhansari82@gmail.com");
	a.setAcc_no(543212345678L); 
	a.setBalance(342154);
	
	System.out.println(a.getName());
	System.out.println(a.getEmail());
	System.out.println(a.getAcc_no());
	System.out.println(a.getBalance());
  } 
  }