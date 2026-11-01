public class SumLastFirstDigit {
    public static void main(String[] args) {
        int num=12345;
        int ans=lastdigit(num)+Firstdigit(num);
        System.out.println(ans);
    }

        static int lastdigit(int num){
            int lastdigit=num%=10;
            return num;
        }
        static int Firstdigit(int num){
            while(num>=10){
                num=num/10;
            }
            return num;
        
    }
    
}
