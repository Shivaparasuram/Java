package OOPS_2.ARRAY.FILE_4.WRITE_2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class PRO3_FilesWrite {
    static void main(String[] args) {
        String content ="DEMO JAVA";
        try
        {
            Files.write(Paths.get("Eight.txt"),content.getBytes());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
