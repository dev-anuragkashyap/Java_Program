//finding the reverse of the given number
import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int rem=0;
        System.out.println("Enter Nuber to reverse:");
        int Number=sc.nextInt();
        while(Number!=0){
            rem= Number%10;
            rev=(rev*10)+rem;
            Number=Number/10;
        }
        System.out.println(rev);
        sc.close();
        
    }
}