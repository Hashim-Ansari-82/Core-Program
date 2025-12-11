package CollectionFramwork;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Object> s=new Stack<>();
        s.push("Hashim");
        s.push("Ansari");
        s.push(2);
        s.push("Rani");
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.size());
        System.out.println(s.search("Hashim"));
        System.err.println(s);
    }
}
