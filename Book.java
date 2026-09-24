public class Book {
    String title;
    String author;
    int price;
    //constructor
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "Java Ka professor", 300);
        b.display();
    }
}
