public class EmployeeStatic {
    int Id;
    String Name;
    int salary;
    static String CompanyName;

    EmployeeStatic(int Id,String Name,int salary){
        this.Id=Id;
        this.Name=Name;
        this.salary=salary;
    }

    static String ShowCompanyName(){
        CompanyName="HCL tech";
        return CompanyName;
    }
    void display(){
        System.out.println("Employee Id: "+Id);
        System.out.println("Employee Name: "+Name);
        System.out.println("Employee Salary: "+salary);
    }
    public static void main(String[] args) {
        EmployeeStatic obj1=new EmployeeStatic(1,"Anurag",120000);
        EmployeeStatic obj2=new EmployeeStatic(2,"Atul",130000);
        EmployeeStatic obj3=new EmployeeStatic(3,"Amit",110000);
        System.out.println("--------------------------------------");
        System.out.println(EmployeeStatic.ShowCompanyName());
        //System.out.println(EmployeeStatic.companyId);
        obj1.display();
        obj2.display();
        obj3.display();

    }
}
