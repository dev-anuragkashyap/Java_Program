//this() Constructor Chaining
public class Product {
    String name;
    int price;
    Product(){
    }
    Product(String name){
        this.name = name;
    }
    Product(String name, int price){
        this(name);
        this.price = price;
    }
    void display(){
        System.out.println(name + " " + price);
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mobile", 20000);
        p1.display();
        p2.display();
        p3.display();
    }
}