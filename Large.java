//Finding the largeest Number btw Two numbers
import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + "is large" + b);
        } else {
            System.out.println(b + "is large");
        }
        sc.close();
    }

}
