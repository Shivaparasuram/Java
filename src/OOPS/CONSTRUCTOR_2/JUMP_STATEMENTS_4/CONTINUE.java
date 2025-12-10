package OOPS.CONSTRUCTOR_2.JUMP_STATEMENTS_4;

public class CONTINUE {
    static void main(String[] args) {
        int i=1;
        while(i<=10){

            if(i==5){   //skip only 1 iteration
                i++;
                continue;
            }

            System.out.println(i);
            i++;

        }



    }
}
