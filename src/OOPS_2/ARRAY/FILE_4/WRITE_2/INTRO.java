package OOPS_2.ARRAY.FILE_4.WRITE_2;

/*
    WRITE TO FILE
Write into existing file else create and then write


    TYPES
 1.FileWriter.write()-- method -- close is mandatory --

    SYNTAX
FileWriter obj= new FileWriter("Path");
obj.write ("Hello");


 2.FileOutputStream()-- Constructor -- binary data -- write byte data file -- image & audio

    SYNTAX
FileOutputStream fos= new FileOutputStream("Path");
String content ="Welcome";
byte [] bytes = content.getByte();
fos.write(bytes);
fos.close();


 3.Files.Write() -- method -- write byte or string to file
 flexible with both text and binary

    SYNTAX
String content ="Hello ";
File.write(Path.get("name path"),content.getByte());


 */

public class INTRO {
}
