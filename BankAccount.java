public class BankAccount {
    int accountNumber;
    String holderName;
    int balance;

    BankAccount(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    void display(){
        System.out.println("Bank Account Details:");
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name: "+holderName);
        System.out.println("Balance: "+balance);
        System.err.println("-----------------------------");
    }
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(123456, "Him", 1000);
        BankAccount obj2 = new BankAccount(789012, "Rim", 2000);
        obj1.display();
        obj2.display();
    }
}
