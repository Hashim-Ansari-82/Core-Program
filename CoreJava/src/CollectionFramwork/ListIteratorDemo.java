package CollectionFramwork;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        ArrayList<Object> al=new ArrayList<>();

        al.add("Hashim");
        al.add("Uttar Pradesh");
        al.add("S K");
        al.add("R");
        ListIterator<Object> lt= al.listIterator();

        System.err.println("<---- Forward Traverse ----->\n");

        while(lt.hasNext()) {
            Object element=lt.next();
            System.out.println("Element : "+element
                    +" | Next Index : "+lt.nextIndex()
                    +" | Previous Index : "+lt.previousIndex());

            if (element.equals("R")) {
                lt.remove();
            }
            else if (element.equals("Hashim")) {
                lt.add("Rani");
            }
            else if (element.equals("S K")) {
                lt.set(143);
            }
            else {
                lt.add("N");
            }
        }
        System.out.println("\nList After forward Traverse : "+al);

        System.out.println("\n<---- Backward Traverse ---->\n");
        while(lt.hasPrevious()) {
            Object element = lt.previous();
            System.out.println("Element : " + element
                    + " | Next Index : " + lt.nextIndex()
                    + " | Previous Index : " + lt.previousIndex());
            }
        System.out.println("\n<---- Final List ----->"+al);
        }
}
