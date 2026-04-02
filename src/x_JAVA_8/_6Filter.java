package x_JAVA_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class _6Filter {
    public static void main(String[] args){
        List num= Arrays.asList(1,20,42,5,6,7,89,10);

//        Predicate<Integer> p= new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n%2==0;
//            }
//        };


        // in stream v have filter -- filter accept Predict interface as parameter
        // -- but Predicate as inbuild method called Test
        Predicate<Integer> p= n->n%2==0;

        Stream<Integer> s1 = num.stream().filter(p);
        s1.forEach(i-> System.out.println(i));
    }
}
