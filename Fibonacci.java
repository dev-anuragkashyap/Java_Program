//Fibonacci Series Progeam
public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int next;


        for (int i = 0; i < 5; i++) {
            next = first + second;
            System.out.println(next);

            first = second;
            second = next;
        }
    }
}