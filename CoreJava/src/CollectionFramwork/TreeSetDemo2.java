package CollectionFramwork;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>(new MyComparator1());
           ts.add("Hashim");
           ts.add("Ansari");
           ts.add("Koilsa");
           ts.add("S K Nagar");
           ts.add("Uttar Pradesh");
        System.out.println(ts);
    }
}
class MyComparator1 implements Comparator<Object>{
    public int compare(Object c, Object d){
       String s=(String)c;
       String s1=(String)d;
        // return c.compareTo(d);
        return -s.compareTo(s1);
       // return d.compareTo(c);
       // return -d.compareTo(c);
        // return +1;
       // return -1;
      //  return 0;
    }
}
