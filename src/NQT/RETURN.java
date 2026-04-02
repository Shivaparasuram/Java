package NQT;

import java.util.Scanner;

public class RETURN
{
    static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int res;
        if(n%2!=0)
        {
             res= (int) Math.pow(2,(n-1)/2); //odd
        }
        else
        {
             res =(int) Math.pow(3,(n/2)-1);  //odd

        }
        System.out.println("output "+res);
    }
}
//output  1 1 2 3 4 9 8 27 16 81 32