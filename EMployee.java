

class EMployee{
    int id;
    String name;
    int salary;
    static int count=0;
    EMployee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        count++;
    }
    void display(){
        System.out.println("****************Employeee details***************");
        System.out.println("employee id"+id);
        System.out.println("employee Name:"+name);
        System.out.println("employee salaey:"+salary);
        System.out.println("Toatal object formed: "+EMployee.count);
        System.out.println("--------------------------------------------");

    }
    public static void main(String[]args){

        EMployee obj1=new EMployee(1,"Anurag",12345);
        EMployee obj2=new EMployee(2, "hiiiii", 123456);
        EMployee obj3=new EMployee(3, "hello",1234);
        obj1.display();
        obj2.display();
        obj3.display();
        
    }
}