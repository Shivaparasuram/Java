package OOPS.ENCAPSULATION_6;

class Encap {
    private String name="Dude!";   //Encapsulated
    private  int age=22;           //Encapsulated

    public void setName(String name1){   //SETTER
        name=name1;
    }
    public void setAge(int age1){        //SETTER
        age=age1;
    }

    public String getName(){      //GETTER
        return name;
    }
    public int getAge(){          //GETTER
        return age;
    }
}

public class PRO1 {
    static void main(String[] args) {
        Encap obj = new Encap();
        obj.setName("SHIVA !x");
        obj.setAge(18);
        System.out.println(obj.getName());
        System.out.println(obj.getAge() + " !");
    }
}