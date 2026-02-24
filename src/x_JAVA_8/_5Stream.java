package x_JAVA_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class _5Stream {
    static void main(String[] args) {
        List<Integer> val= Arrays.asList(1,3,4,78,90,24);
        Stream<Integer> stream=val.stream();
        Stream<Integer> s1=val.stream();
        stream.forEach(s->System.out.println(s));
      //stream.forEach(s->System.out.println(s));  -- will give error as the stream is once used already

    }
}
