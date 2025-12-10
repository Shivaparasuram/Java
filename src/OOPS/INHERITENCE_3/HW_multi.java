package OOPS.INHERITENCE_3;

class college{
    String name;
    String address;
    college(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void Dcollege(){
        System.out.println("name "+name+" address "+address);
    }
}
class Department extends college{
    String Dep_name;
    Department(String Dep_name,String name,String address){
        super(name,address);
        this.Dep_name=Dep_name;
    }
    public void D_Deatils(){
        System.out.println("D name "+Dep_name);
    }
}
class Student extends Department{
    String S_name;
    int reg0;
    Student(String S_name,int reg0,String Dep_name,String name,String address){
        super(name,Dep_name,address);
        this.S_name=S_name;
        this.reg0=reg0;

    }
    public void S_Deatils()
        {
        System.out.println("Student NAme: "+S_name+"\nREg no: "+reg0+"\nDepartment name:  "+Dep_name+"\nCollege Name: "+name+"\nCollege Address: "+address);
    }
}
class HW {
    static void main(String[] args) {

        Student obj=new Student("Dude",12345,"AI","EPCET","BENGALURU");
        obj.S_Deatils();

    }
}
