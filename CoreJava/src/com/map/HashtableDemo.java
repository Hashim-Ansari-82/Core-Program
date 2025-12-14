package com.map;

import java.util.Hashtable;

class Temp{

    int i;
    Temp(int i){
      this.i=i;
    }
    public int hashCode(){
        return i;
    }
    public String toString(){
        return i+" ";
    }
}

public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Temp,Object> h=new Hashtable<>();
        h.put(new Temp(4)," Hashim");
        h.put(new Temp(7)," Rani");
        h.put(new Temp(9)," Qasim");
        h.put(new Temp(18)," Salim");
        h.put(new Temp(5),143);
        System.out.println(h);
    }
}
