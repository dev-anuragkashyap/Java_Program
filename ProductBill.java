public class ProductBill {
    String Store;
    int id;
    String name;
    int price;
    int quantity;

    ProductBill(String Store,int id, String name,int price,int quantity){
        this.Store=Store;
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    int totalPrice(){
        return price*quantity;
    }
    void display(){
        System.out.println("**********Product Bill**********");
        System.out.println("Store:"+Store);
        System.out.println("Product Id: "+id);
        System.out.println("Product Name: "+name);
        System.out.println("Product Price: "+price);
        System.out.println("Product Quantity: "+quantity);
        System.out.println("Total Price: "+ totalPrice());
        System.out.println("---------------------------------");

    }
    public static void main(String[] args) {
        ProductBill Obj1=new ProductBill("kirana",10,"ashirvad atta 5kg",599,4);
        ProductBill Obj2=new ProductBill("kirana",11,"ashirvad atta 10kg",1099,2);
        Obj1.display();
        Obj2.display();
    }
}
