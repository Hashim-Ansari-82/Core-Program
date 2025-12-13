package com.map.hashmap;

import java.util.HashMap;
import java.util.*;

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
            System.err.println(m.getKey()+" ---->"+m.getValue());
            if(m.getKey().equals(15)){
                m.setValue(" U P");
            }

        }
        System.out.println(hm);
    }
}
