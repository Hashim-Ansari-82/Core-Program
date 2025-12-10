package CoreProgram;

class Table{
    public static void  main(String[] args ){
        for(int i = 1;i<=10 ; i++){
           if(i == 3 || i==5){
                continue;
            }
       //  for(int j = 1; j<=10; j++ )
       
            System.out.println(i);
        }
        //System.out.println();
    } 
}
