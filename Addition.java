///////////////////////////////////////////////
/// Addition of Two Numbers
/// //////

import java.util.Scanner;
class Addition {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a=sc.nextInt();
    System.out.println("Enter second number: ");
    int b=sc.nextInt();
    

    /*int a = 5;
    int b = 139;
    int c = a + b;*/
    System.out.println("The sum is: " + (a+b));
    sc.close();
}
}