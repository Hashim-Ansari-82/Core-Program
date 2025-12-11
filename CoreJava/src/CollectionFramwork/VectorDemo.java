package CollectionFramwork;

import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Object> v=new Vector<>(10,2);
        System.out.println("1-->"+v.capacity());
        for(int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println("2-->"+v.capacity());
        v.addElement("R");
        v.addElement('H');
        System.out.println("3-->"+v.capacity());
        v.addElement(143);
        System.out.println("4-->"+v.capacity());
        ListIterator<Object> l=v.listIterator(v.size());
        while(l.hasPrevious()){
            System.out.println(l.previous());
        }
    }
}
