package OOPS_2.ARRAY.FILE_4.CREATION_1;

/*
FILES - Digital container -- hold info - like image text or pros

    OPERATIONS
read
write
delete
BY Java API

    TYPES
1.Text file - lyrics of song ,readable , edit ,text , e.g. txt, csv, xml, files
2.Binary file - images ,non-readable , can't edit,non text  e.g. mp3, exe, jpg

     TYPES FOR CREATING
1.File.creatNewFile() --  method  -- empty file -- true if file created else false
-- cant create multi files from same name -- give failed

    SYNTAX
 File obj = new File("Example.txt");
 obj.creatNewFile();

2.FileOutputStream() -- constructor --its like open pipe and pour data into file
--preferred for Binary files --- more control over how to write data into file
--run successfully but creates once with same name

    SYNTAX
 FileOutputStream fos = new FileOutputStream("Example.mp3");

3.Files.write() -- method  -- write directly into file(bytes or string) - small projects

      SYNTAX
File.write(paths.get(),"Helloooo ".getBytes());
 */

public class INTRO {
}
