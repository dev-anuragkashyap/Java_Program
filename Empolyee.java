//Use this to refer to current Object's variables
public class Empolyee {
    int Id;
    String name;
    int salary;
    //constructor
    Empolyee(int Id, String name, int salary){
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println("Employee ID: " + Id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Empolyee e = new Empolyee(101, "Anurag", 50000);
        e.display();
    }
}
