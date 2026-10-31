public class Electricbill {
    String name;
    int Cnumber;
    int unit;
    static int rateperUnit=5;

    Electricbill(String name,int Cnumber,int unit){
        this.name=name;
        this.Cnumber=Cnumber;
        this.unit=unit;
    }
    int CustomerBill(){
        return unit*rateperUnit;
    }
    void display(){
        System.out.println("*********Customer Bill********");
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Number: "+Cnumber);
        System.out.println("Unit consumed: "+unit);
        System.out.println("Customer bill: "+CustomerBill());
        System.out.println("----------------------------------------");
    }
    public static void main(String[] args) {
        Electricbill obj1=new Electricbill("Anurag", 12345, 5);
        obj1.display();
        System.err.println("bill after rateperunit changed");
        Electricbill.rateperUnit=9;
        Electricbill obj2=new Electricbill("Anurag", 12345, 5);
        obj2.display();
    }
    
    
}
