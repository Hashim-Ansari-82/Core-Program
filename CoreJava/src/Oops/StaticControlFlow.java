package Oops;

class StaticControlFlow{
    static int i=10;
    static {
        m();
        System.out.println("1st Static Block "+i);
    }
    public static void main(String[] args){
        m();
        System.out.println("Main Method");
    }
    public static void m(){
        System.out.println(j+","+i);
    }
    static{
        System.out.println("2nd Static Block");
    }
    static int j=20;

}