package OOPS_2.ARRAY.FILE_4.WRITE_2;

import java.io.FileOutputStream;

public class PRO2_FileOutputStream {
    public static void main (String[] args)
    {
        String content ="Hello Java Developers !";
       try( FileOutputStream obj= new FileOutputStream("Lion.txt")){
           byte[] bytes=content.getBytes();
           obj.write(bytes);

       }
       catch (Exception e)
       {
           throw new RuntimeException(e);
       }
    }
}
