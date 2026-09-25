public class StudentS {
    static String CollegeName;
    String name;
    int rollno;
    void display() {
        System.out.println("College Name: " + CollegeName);
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll No: " + rollno);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        StudentS obj1 = new StudentS();
        obj1.CollegeName= "Study Hall";
        obj1.name = "Amit";
        obj1.rollno = 1;
        obj1.display();
        StudentS obj2 = new StudentS();
        obj2.name = "Atul";
        obj2.rollno = 2;
        obj2.display();
    }

}
