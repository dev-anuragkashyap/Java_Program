public class CollegeStudent {
    String Name;
    int rollno;
    int mark;
    static String collegename;
    static int totalstudent=0;
    
    CollegeStudent(String Name,int rollno,int mark){
        this.Name=Name;
        this.rollno=rollno;
        this.mark=mark;
        totalstudent++;

    }
    
         static{
            collegename="The Study Hall College";
        }
        void display(){
            System.out.println("Student Name: "+Name);
            System.out.println("Student Roll NO. :"+rollno);
            System.out.println("Marks :"+mark);
            System.out.println("---------------------------------");
        }
        public static void main(String[] args) {
            CollegeStudent obj1= new CollegeStudent("Anurag", 1, 89);
            CollegeStudent obj2= new CollegeStudent("Atul", 2, 78);
            CollegeStudent obj3= new CollegeStudent("Shubham", 3, 90);
            
            System.out.println(CollegeStudent.collegename);
            System.out.println(CollegeStudent.totalstudent);
            obj1.display();
            obj2.display();
            obj3.display();
        }
    }

