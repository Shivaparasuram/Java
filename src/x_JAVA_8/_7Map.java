package x_JAVA_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class _7Map {
    static void main(String[] args) {
        List num = Arrays.asList(12,34,5,7,24,5);

        Predicate<Integer> p=n->n%2==0;

//        Function<Integer,Integer> f= new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer n) {
//                return n*2;
//            }
//        };

        Function<Integer,Integer> f=n->n*10;

        Stream s1=num.stream().filter(p);
        Stream<Integer> s2=s1.map(f);
        s2.forEach(i-> System.out.println(i));

    }
}
