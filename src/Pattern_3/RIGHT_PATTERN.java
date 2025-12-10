package Pattern_3;

public class RIGHT_PATTERN {
    static void main(String[] args) {

        int n =5;

       for(int i =1;i<=n;i++){

           for (int j=1;j<=i;j++){
               if( i==j || j==1 || i==n) {
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
       System.out.println(" ");

       }
    }
}
