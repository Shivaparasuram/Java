package OOPS.INHERITENCE_3;

class one{
    public void parent(){
        System.out.println("Parent !");
    }
}
class two extends one{
    public void Child(){
        System.out.println("Yashwanth !");
    }
}
class three extends one{
    public void Child2(){
        System.out.println("Vishal !");
    }
}


public class PRO5_hierarchy
{
    static void main(String[] args) {

        two obj =new two();
        obj.parent();
        obj.Child();

    }
}
