package com.oops.abstraction;


interface Warrior{
    static void eat(){
        System.out.println("Dog is eating meat");
    }
}
interface Weapon{
    static void eat(){
        System.out.println("Man eat Meat");
    }

}
public class InterfaceInStaticMethod implements Warrior,Weapon{
    public static void main(String[] args) {
        Weapon.eat();
        Warrior.eat();
    }

}
