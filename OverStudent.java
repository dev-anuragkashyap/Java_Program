public class OverStudent {
    String name;
    int age;
    double marks;
    OverStudent(String name) {
        this.name = name;
    }
    OverStudent(String name, int age) {
        this(name);
        this.age = age;
    }
    OverStudent(String name, int age, double marks) {
        this(name, age);
        this.marks = marks;
    }
    int dispaly() {
        System.err.println("student details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.err.println("-----------------------------");
        return 0;
    }
    public static void main(String[] args) {
        OverStudent obj1 = new OverStudent("Amit");
        OverStudent obj2 = new OverStudent("Atul", 20);
        OverStudent obj3 = new OverStudent("Rohit", 22, 85.5);
        obj1.dispaly();
        obj2.dispaly();
        obj3.dispaly();
    }

}
