package x_JAVA_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class _8Reduce {
    static void main(String[] args) {
        List num = Arrays.asList(2,3,5,7,9,10);

        Predicate<Integer> p=n->n%2!=0;
        Function<Integer,Integer> f= a->a*10;

//        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer a, Integer b) {
//                return (a+b);
//            }
//        };

        BinaryOperator<Integer> b=(a,c)->(a+c);

        Stream<Integer> s1=num.stream().filter(p);
        Stream<Integer> s2 =s1.map(f);
        int result= s2.reduce(0,b);
        System.out.println(" Filter even map mul 10 and sum is in Result  "+result);

    }
}
