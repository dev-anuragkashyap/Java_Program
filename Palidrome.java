//Finding the given number is palidrome Number or not
import java.util.Scanner;
public class Palidrome {
    public static void main(String[]args){
    Scanner Scan=new Scanner(System.in);
    System.out.println("Enter a number");
    int Num=Scan.nextInt();
    int OgNum=Num;

    int rev=0;
    int rem=0;
    while(Num!=0){
        rem=Num%10;
        rev=rev*10+rem;
        Num=Num/10;
    }
    System.out.println("The reverse no is  " + rev);

    if(OgNum==rev){
        System.out.println("the Number is Palidrome Number");
    }else{
        System.out.println("the number is not Palidrome Number");
    }
    Scan.close();


    
}}
