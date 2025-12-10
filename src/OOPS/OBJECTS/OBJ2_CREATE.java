package OOPS.OBJECTS;

class EPCET{
    String name ="DUDE";
    String Combo="AI";
    int age =22;
    int reg=46;

}

class SJCC {
    String name ="BROO";
    String Combo="MCA";
    int age =20;
    int reg=666;

}

public class OBJ2_CREATE {
    static void main(String[] args) {

        EPCET ai;
        ai = new EPCET();
        SJCC mca= new SJCC();

        System.out.println("Name is "+ai.name+"!"+"\nCombo is "+ai.Combo+"!"+"\nage is "+ai.age+"!"+"\nRegister number is "+ai.reg+"!");
        System.out.println("\nName is "+mca.name+"!"+"\nCombo is "+mca.Combo+"!"+"\nage is "+mca.age+"!"+"\nRegister number is "+mca.reg+"!");

    }
}
