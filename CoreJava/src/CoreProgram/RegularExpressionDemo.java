package CoreProgram;

import java.util.regex.*;

public class RegularExpressionDemo {
    public static void main(String[] args) {
        int count=0;
        Pattern p= Pattern.compile("r*");
        Matcher m=p.matcher("ratrgr6rrrrhr");
        while(m.find()){
            count++;
            System.out.println(m.start()+" ---> "+m.end()+" ---> "+m.group());
        }
        System.out.println("Total occurred : "+count);
    }
}
