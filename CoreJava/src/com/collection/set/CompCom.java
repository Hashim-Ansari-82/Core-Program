package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{

    String name;
    int eid;
    Employee(String name, int eid){
        this.name=name;
        this.eid=eid;
    }
    public String toString(){
        return name+"---"+eid;
    }
    public int compareTo(Object o){

        int eid1=this.eid;
        Employee e=(Employee)o;
        int eid2=e.eid;
        if(eid1 < eid2){
            return -1;
        }
        else if(eid1 > eid2){
            return +1;
        }
        else
            return 0;
    }
}
public class CompCom {
    public static void main(String[] args) {

        Employee e1=new Employee("Hashim",82);
        Employee e2=new Employee("Rani",75);
        Employee e3=new Employee("Altmash",18);
        Employee e4=new Employee("Arslan",96);
        Employee e5=new Employee("Mr Srk",20);

        TreeSet<Employee> ts=new TreeSet<>();
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        System.out.println(ts);
        TreeSet<Employee> ts1=new TreeSet<>(new Comparator2nd());
        ts1.add(e1);
        ts1.add(e2);
        ts1.add(e3);
        ts1.add(e4);
        ts1.add(e5);
        System.out.println(ts1);
    }
}
class Comparator2nd implements Comparator {

    public int compare(Object o1, Object o2){

        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        String s1=e1.name;
        String s2=e2.name;
        return s2.compareTo(s1);
    }
}