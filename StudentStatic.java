class StudentStatic {

    static int count = 0;

    StudentStatic() {
        count++;
    }

    public static void main(String[] args) {

        StudentStatic obj1 = new StudentStatic();
        StudentStatic obj2 = new StudentStatic();
        StudentStatic obj3 = new StudentStatic();
        StudentStatic obj4 = new StudentStatic();
        StudentStatic obj5 = new StudentStatic();

        System.out.println("Total objects created: " + StudentStatic.count);
        
    }
}