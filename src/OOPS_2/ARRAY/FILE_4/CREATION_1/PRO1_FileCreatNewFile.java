package OOPS_2.ARRAY.FILE_4.CREATION_1;

import java.io.File;

public class PRO1_FileCreatNewFile {
    static void main(String[] args) {
        File obj=new File("one.text" );
        try
        {
            if(obj.createNewFile()){
                System.out.println("Files created successfully !");
            }
            else{
                System.out.println("Mission Failed !");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
