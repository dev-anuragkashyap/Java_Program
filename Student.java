public class Student {
    int rollno;
    String name;
    int marks1;
    int marks2;
    int marks3;
   
    //constructor
    Student(int rollno, String name, int marks1, int marks2, int marks3){
        this.rollno = rollno;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    int totalMarks(){
        int totalmarks = marks1 + marks2 + marks3;
        return totalmarks;  
       
    }
    int percentage(){
     
        int percentage = totalMarks() / 3;
        return percentage;
    }
    void display(){
        System.out.println("Student Total Marks: " + totalMarks());
        System.out.println("Student Percentage: " + percentage());
        
    }
    public static void main(String[] args) {
        Student s = new Student(101, "Anurag", 80, 90, 70);
        s.display();
    }
}
