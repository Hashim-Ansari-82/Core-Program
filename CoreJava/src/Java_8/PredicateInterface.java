package Java_8;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

       /* Predicate<Integer> isEven=x -> x%2==0;

        List<Integer> number=Arrays.asList(2,1,3,4,5,4,6,9,18,14,12,254,9);
        for (Integer i:number) {

           if(isEven.test(i)) {

               System.out.print(i+" ");
           }
        }*/
        Predicate<String> startWithH= x -> x.toLowerCase().charAt(0) == 'h';
        Predicate<String> endWithM= x -> x.toLowerCase().charAt(x.length()-1) == 'n';
        Predicate<String> negate= x -> x.toLowerCase().charAt(0) == 'h';
        Predicate<String> and=startWithH.and(endWithM);
        Predicate<String> or=startWithH.or(endWithM);
        System.out.println(and.test("Hashim"));
        System.out.println(or.test("Hashim"));
        System.out.println(negate.negate().test("Hashim"));
    }
}
