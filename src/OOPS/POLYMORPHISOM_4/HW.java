package OOPS.POLYMORPHISOM_4;
class Bank{
    public void Bank1(String name,String address){
        System.out.println(name+" "+address);
        
    }
    public void Bank1(String name,int ISFC,long Acc_no){
        System.out.println(name+" "+ISFC+" "+Acc_no);

    }

}

public class HW {
    static void main(String[] args) {
        Bank obj=new Bank();
        obj.Bank1("Canara",1234,1234567890);
    }
}
