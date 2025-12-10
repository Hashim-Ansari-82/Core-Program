package CoreProgram;

class Prime{
    public  static void main(String[] args){
        int a=17;

        for(int i=1; i<=a; i++)
        {
            if(a%i==0)
            {
             System.out.println(a+" is prime no");
            }
            else
            {
                System.out.println(a+" is not prime no");
            }
        }
    }
}