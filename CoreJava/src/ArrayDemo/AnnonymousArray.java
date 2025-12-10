package ArrayDemo;

class AnnonymousArray{
    public static void main(String[] args){
        sum(new int[]{10,20,30,40});
      //  System.out.println(s[0].length);
    }
    static void sum(int[] s){
        int total=0;
        for(int x:s){
            total=total+x;
        }
        System.out.println(total);
    }
}
