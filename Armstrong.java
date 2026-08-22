// finding the given number is Armstrong number or not.
import java.util.Scanner;
public class Armstrong{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your three digit number");
        int OgNumber=Sc.nextInt();
        int Number=OgNumber;
        int sum=0;
        while (Number>0) {
            int digit=Number % 10;
            sum+=(digit*digit*digit);
            Number/=10;
            
        }
        if(sum==OgNumber){
            System.out.println(OgNumber+"  is a Armstrong Number");
        }else{
            System.out.println(OgNumber+"is not a Armstrong Number");
        }

        Sc.close();
        

    }
    }
