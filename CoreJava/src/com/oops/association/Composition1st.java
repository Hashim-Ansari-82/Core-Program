package com.oops.association;

class College{
    String name,address,department;
    College(String name,String address,String department){

        this.name=name;
        this.address=address;
        this.department=department;
    }
    public void showDetail(){
        System.out.println("College Name : "+name+" \nCollege Address : "
                +address+"\nCollege Department : "+department);
    }
}
class Manager {
    String name, address;
    int idCard;
    College c;
    Manager(String name, int idCard){
        this.name=name;
        this.idCard=idCard;
    }
    public void lookPosition(){
        new College("KIC College ","Rasoolpur ","Art,Science,Commerce");
        System.out.println("Manager Name : "+name);
        System.out.println("Manager idCard : "+idCard);
        c.showDetail();
    }
}
public class Composition1st {
    public static void main(String[] args) {
     Manager m=new Manager("Misra",12321);
     m.lookPosition();
    }
}
