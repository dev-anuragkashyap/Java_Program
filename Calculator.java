public class Calculator {
    int number;
     void setNumber(int number){
        this.number = number;
        displayNumber();
    }
    void displayNumber(){
        System.out.println("the Number is:"+number);
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setNumber(200);
    }
}
