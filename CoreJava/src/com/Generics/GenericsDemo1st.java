<<<<<<< HEAD
package com.generics;
=======
package com.Generics;
>>>>>>> f3e1def09101a6122c098c4ca4c25b0cf7fc45bf

class Gen<T>{

    T obj;
    Gen(T obj){
        this.obj=obj;
    }
    public void show(){
        System.out.println("The type of Object : "+obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}
public class GenericsDemo1st {
    public static void main(String[] args) {
        Gen<String> g1=new Gen<>("Hashim");
        System.out.println(g1.getObj());
        g1.show();

        Gen<Integer> g2=new Gen<>(143);
        System.out.println(g2.getObj());
        g2.show();

        Gen<Double> g3=new Gen<>(122.3);
        System.out.println(g3.getObj());
        g3.show();

        Gen<Character> g4=new Gen<>('R');
        System.out.println(g4.getObj());
        g4.show();

        Gen<Boolean> g5=new Gen<>(false);
        System.out.println(g5.getObj());
        g5.show();

        Gen<Byte> g6=new Gen<>((byte) 12);
        System.out.println(g6.getObj());
        g6.show();

        Gen<Short> g7=new Gen<>((short) 12);
        System.out.println(g7.getObj());
        g7.show();

        Gen<Long> g8=new Gen<>((long) 12);
        System.out.println(g8.getObj());
        g8.show();
    }
}
