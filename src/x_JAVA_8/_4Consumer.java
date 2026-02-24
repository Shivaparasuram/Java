package x_JAVA_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Dxmo implements Consumer<Integer>{  //****************************
    public void accept(Integer i){        //****************************
        System.out.println(i);
    }
}


public class _4Consumer {
    static void main(String[] args) {
        List<Integer> num = Arrays.asList(7,4,6,8,9,2);
        Consumer<Integer> obj=new Dxmo();
        num.forEach(obj);                 //**************************************

    }

}
