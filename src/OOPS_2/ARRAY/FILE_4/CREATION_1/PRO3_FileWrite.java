package OOPS_2.ARRAY.FILE_4.CREATION_1;

import java.nio.file.Files;
import java.nio.file.Paths;

public class PRO3_FileWrite {


    
    static void main(String[] args)
    {
        String s="image.png";

        try {
            Files.write(Paths.get(s),"Hello GuyssSss !x".getBytes());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
