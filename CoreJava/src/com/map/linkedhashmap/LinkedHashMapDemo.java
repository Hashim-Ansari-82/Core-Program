package com.map.linkedhashmap;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();

        hm.put(12 ," Hashim");
        hm.put(13 ," Asim");
        hm.put(14 ," Mr Srk");
        hm.put(15 ," Adnan");
        hm.put(16 ," Arslan");
        System.out.println(hm);
        System.out.println(hm.put(13," Rani"));
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
