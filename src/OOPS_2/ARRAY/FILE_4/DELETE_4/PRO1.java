package OOPS_2.ARRAY.FILE_4.DELETE_4;

import java.io.File;

public class PRO1 {
    public static void main(String[] args){
        File file = new File("one11.txt");
        if (file.exists())
        {
            if(file.delete())
            {
                System.out.println("File deleted Success !");
            }
            //Exist and unable to delete
            else {
                System.out.println("Unable to delete ");
            }
        }
        else
        {
            System.out.println("File doesn't exist ! ");
        }
    }
}
