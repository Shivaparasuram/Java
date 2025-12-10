package OOPS_2.ARRAY.FILE_4.WRITE_2;

import java.io.File;
import java.io.FileWriter;

public class PRO1_FileWriter {
     static void main(String[] args) {

        File obj =new File("three.txt");

        try
        {
            if (obj.createNewFile()){
                System.out.println("File created Successfully !");
            }
            else
            {
                System.out.println("Mission failed !");
            }
            FileWriter obj2= new FileWriter("three.txt");
            obj2.write("Hello BuddiezZz !");
            obj2.close();
        }
        catch (Exception e)
        {
            System.out.println("An error occurred.");
        }
    }
}
