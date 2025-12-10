package OOPS_2.ARRAY.FILE_4.READ_3;

import java.io.File;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PRO3_ReadAllLines {
    static void main(String[] args) {
        try {
            List<String> list= Files.readAllLines(Paths.get("one.text"));

            for(String s:list) {
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println("Exception Caught !x");
        }
    }
}
