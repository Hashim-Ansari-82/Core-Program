package CoreProgram;

class FibbanociSeries{
    public static void main (String args[]){
        int a=0;
        int b=1;
        System.out.println("Your Fibbanoci Series");
           System.out.print(a+","+b);

       for(int i=1; i<=10; i++){
       int sum=a+b;
       System.out.print(","+sum);
       
       a=b;
       b=sum;
       }

    }
}