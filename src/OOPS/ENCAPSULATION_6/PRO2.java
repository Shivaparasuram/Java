package OOPS.ENCAPSULATION_6;
class College{
    private String name="Dude !";
    private String Cname="EPCET";
    private int Reg=46;
    private String Location="Bengaluru";

    //SETTER METHOD
    public void setName(String name1){
        name=name1;
    }
    public void setCname(String Cname1){
        Cname=Cname1;
    }
    public void setReg(int Reg1){
        Reg=Reg1;
    }public void setLocation(String Location1){
        Location=Location1;
    }


    //GETTER METHOD
    public String getName(){
        return name;
    }
    public String getCname(){
        return Cname;
    }
    public int getReg(){
        return Reg;
    }
    public String getLocation(){
        return Location;
    }
}

public class PRO2 {
    static void main(String[] args) {
        College obj=new College();
        obj.setName("Shiva !");
        obj.setCname("S.JCC !x");
        obj.setReg(64);
        obj.setLocation("Bombay !");
        System.out.println("Name "+obj.getName()+"\nCollege "+obj.getCname()+"\nRegister no. "+obj.getReg()+"\nAddress "+obj.getLocation());

    }
}
