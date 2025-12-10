package OOPS_2.ARRAY.FILE_4.READ_3;

import java.io.FileInputStream;

public class PRO2_FileInputStream {
    static void main(String[] args) {
        try(FileInputStream obj=new FileInputStream("four.txt"))
        {
            int Data ;
            while ((Data= obj.read())!=-1)
            {
                System.out.print((char)Data);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
