package OOPS_2.ARRAY.FILE_4.CREATION_1;

import java.io.FileOutputStream;

public class PRO2_FileOutputStream {
    static void main(String[] args) {
        try (FileOutputStream obj= new FileOutputStream("Image.jpg")){
            System.out.println("File Created !");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
          //  System.out.println("failed ");
        }
    }
}
