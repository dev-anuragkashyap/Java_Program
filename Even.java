
//Find th egiven Number is even or Odd
import java.util.Scanner;
public class Even {
public static void main(String[]args){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=Sc.nextInt();
    if(num%2==0){
        System.out.println(num+"is even ");
        }else{
        System.out.println(num+"is odd");
        }
        Sc.close();
}
}
