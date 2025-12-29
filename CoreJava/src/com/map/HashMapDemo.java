package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();

        hm.put(12 ," Hashim");
        hm.put(13 ," Asim");
        hm.put(14 ," Mr Srk");
        hm.put(15 ," Adnan");
        hm.put(16 ," Arslan");
        System.out.println(hm);
        System.out.println(hm.put(16," Rani"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        Iterator itr=hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry m=(Map.Entry)itr.next();
            System.out.println(m.getKey()+" ---->"+m.getValue());
            if(m.getKey().equals(12)){
                itr.remove();
            }
        }
        System.out.println(hm);
    }
}
