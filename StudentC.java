public class StudentC {
    int id;
    String name;
    int phone;

    void display() {
        System.out.println("student id: " + id);
        System.out.println("student name: " + name);
        System.out.println("student phone: " + phone);
    }

    public static void main(String[] args) {
        StudentC obj1 = new StudentC();
        obj1.id = 1;
        obj1.name = "Amit";
        obj1.phone = 1234567890;
        obj1.display();
        StudentC obj2 = new StudentC();
        obj2.id = 2;
        obj2.name = "Atul";
        obj2.phone = 1237654321;
        obj2.display();
    }
}
