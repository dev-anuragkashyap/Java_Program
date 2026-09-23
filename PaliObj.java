class PaliObj {
    int num;

    // Constructor
    PaliObj(int n) {
        num = n;
    }

    void checkPalindrome() {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is not a Palindrome number");
        }
    }


    public static void main(String[] args) {

        PaliObj obj = new PaliObj(121);

        obj.checkPalindrome();
    }
}