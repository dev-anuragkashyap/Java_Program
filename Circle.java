public class Circle {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    double area() {
        return (int) (3.14 * radius * radius);
    }
    int circumference(){
        return (int) (2 * 3.14 * radius);
    }
    void display() {
        System.out.println("-----------------------------------");
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
        System.out.println("-----------------------------------");
    }
    public static void main(String[]args){
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        c1.display();
        c2.display();   
    }
}
