package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SumNumberInStreams {
    public static void main(String[] args) {

       /* List<Integer> list= Arrays.asList(2,4,6,7,8,9,5,3,2,45,6,7,8,54);
        List<Integer> filteredList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2).distinct()
                .sorted((x,y) -> y-x )
                .limit(6)
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(filteredList);

        List<Integer> collect=Stream.iterate(0,x -> x+1)
                .limit(20)
                .skip(1)
                .filter(x -> x % 2==0)
                .map(x -> x/2)
                .distinct()
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(collect);*/

       long  integer=Stream
               .iterate(1,x -> x + 1)
               .limit(101)
               .map(x -> x/10)
               .distinct()
               .count();
        System.out.println(integer);

    }
}

