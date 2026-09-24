public class Rectangle {
    int lenght;
    int breath;
    Rectangle() {
    }
    Rectangle(int lenght) {
        this.lenght = lenght;
    }
    Rectangle(int lenght, int breath) {
        this(lenght);
        this.breath = breath;
    }
    int area() {
        return (lenght * breath);
    }
    void display() {
        System.out.println("Lenght: " + lenght);
        System.out.println("Breath: " + breath);
        System.out.println("Area: " + area());
    }
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(5, 10);
        r1.display();
        r2.display();
        r3.display();
    }
}
