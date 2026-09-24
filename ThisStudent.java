/*Program to the differciate between Instance variables and parameter.*/
class ThisStudent {
    String name;
    int age;
    ThisStudent(String name,int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

 
    public static void main(String[]args){
        ThisStudent obj1=new ThisStudent("Shubham", 20);
        ThisStudent obj2=new ThisStudent("Rohit", 21);
        obj1.display();
        obj2.display();

    }
    
}
