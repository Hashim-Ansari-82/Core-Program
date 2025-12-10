package CoreProgram;

class PalindromeDemo{
    public static void main(String args[]){
	    long a = 123456789987654321l;
		long b = a;
		long res = 0;
		while(a>0){
		  long c = a%10;
		  res = res*10+c;
		  a = a /10;
		}
		if(b == res){
		  System.out.println(b +" : Is Palindrome Number");
		}
		else
		System.out.println(b+" : is not a Palindrome  Number");
	}
}