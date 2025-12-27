package com.oops.abstraction;


interface Animal{
    default void eat(){
        System.out.println("Dog is eating meat");
    }
}
interface Man{
    default void eat(){
        System.out.println("Man eat cow");
    }
}

public class InterfaceInDefaultMethod implements Man,Animal{

  public void eat(){
       Animal.super.eat();
       Man.super.eat();
   }

    public static void main(String[] args) {
        InterfaceInDefaultMethod i=new InterfaceInDefaultMethod();
        i.eat();
    }
}
