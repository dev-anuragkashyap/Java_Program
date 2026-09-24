//9..............Parameterized Constructor

public class Mobile {
    String brand;
    String model;
    int price;

    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Mobile obj1 = new Mobile("Samsung", "Galaxy S21", 799);
        Mobile obj2 = new Mobile("Apple", "iPhone 13", 999);
        obj1.display();
        obj2.display();
    }
}
