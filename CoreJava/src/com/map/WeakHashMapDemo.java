package com.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args)throws Exception {

        WeakHashMap<Object,String > w=new WeakHashMap<>();
        Key k=new Key();
        w.put(k,"Hashim");
        System.out.println(w);
        k=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(w);

    }
}
class Key{

    public String toString(){
        return "Key";
    }
    public void finalize(){
        System.out.println("Finalize Method Start");
    }
}
