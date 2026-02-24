package x_JAVA_8;

import java.util.Arrays;
import java.util.List;

public class _3ForEach {
    public static void main(String[] args){
        List<Integer> num= Arrays.asList(2,4,6,8,10);

//        for (int i=0;i<num.size();i++){
//            System.out.println(num.get(i));
//        }

//      num.forEach(i->System.out.println(i));
        num.forEach(System.out::println);

    }


}
