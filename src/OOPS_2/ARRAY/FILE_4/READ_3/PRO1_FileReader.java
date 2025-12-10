package OOPS_2.ARRAY.FILE_4.READ_3;

import java.io.FileReader;

public class PRO1_FileReader {
    static void main(String[] args) {

        try (FileReader obj = new FileReader("four.txt"))
        {
            int Data ;   // Print single char
            while ((Data= obj.read())!=-1)
            {
                System.out.print((char)Data);  //Explicit type cast use Friend
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception Caught !");
        }
    }
}
