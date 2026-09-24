//employee salary calculation.
public class EmpolyeeSalary {
    String name;
    int basicsalary;
    int hra;
    int da;
    //constructor
    EmpolyeeSalary(String name, int basicsalary, int hra, int da){
        this.name = name;
        this.basicsalary = basicsalary;
        this.hra = hra;
        this.da = da;
    }
    int GrossSalary(){
        int gsalary=basicsalary+hra+da;
        return gsalary;
    }
    void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + basicsalary);
        System.out.println("Employee HRA: " + hra);
        System.out.println("Employee DA: " + da);
        System.out.println("Employee Gross Salary: " + (GrossSalary()));
    }
    public static void main(String[] args) {
        EmpolyeeSalary ob1 = new EmpolyeeSalary("Anurag", 50000, 10000, 5000);
        ob1.display();
    }
}
