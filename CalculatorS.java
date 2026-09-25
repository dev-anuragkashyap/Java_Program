//Static methods are used to perform basic arithmetic operations like addition, subtraction, multiplication, and division.
import java.util.Scanner;
class CalculatorS{

    static float add(int a, int b) {
        return a + b;
    }

    static float subtract(int a, int b) {
        return a - b;
    }

    static float multiply(int a, int b) {
        return a * b;
    }

    static float divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Addition: " + CalculatorS.add(a, b));
        System.out.println("Subtraction: " + CalculatorS.subtract(a, b));
        System.out.println("Multiplication: " + CalculatorS.multiply(a, b));
        System.out.println("Division: " + CalculatorS.divide(a, b));
        scanner.close();
    }
}