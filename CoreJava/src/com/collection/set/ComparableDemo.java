package com.collection.set;

import java.util.Arrays;

 class Student implements Comparable<Student>{

    String name;
    int marks;
    int roll;
    Student(int roll, String name, int marks){
        this.name=name;
        this.marks=marks;
        this.roll=roll;
    }

     @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
     /*   if (this.roll > o.roll) {
            return +1;
        }
        else if (this.roll < o.roll) {
            return -1;
        }
      else{
          return 0;
        }*/
    }
    @Override
    public String toString() {
        return String.format("\nroll -> %d Name%s marks -> %d",roll,name,marks);
    }
}
public class ComparableDemo {
    public static void main(String[] args) {

      Student[] s={new Student(25," -> Rani   ",53),
                   new Student(12," -> Hashim ",82),
                   new Student(27," -> Qasim  ",28)
      };
        System.out.println("\n<-------- Before Sorting --------->");
        for(Student s1:s){
            System.out.println(s1);
        }
        Arrays.sort(s);
        System.out.println("\n<----------- After sorting ---------->");
        for(Student s1:s){
            System.out.println(s1);
        }
    }
}
