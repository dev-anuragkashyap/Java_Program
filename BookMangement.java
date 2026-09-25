public class BookMangement {
    String title;
    String author;
    int price;

    BookMangement(String title) {
        this.title = title;
    }
    BookMangement(String title, String author) {
        this(title);
        this.author = author;
    }
    BookMangement(String title, String author, int price) {
        this(title, author);
        this.price = price;
    }
    void display() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        BookMangement b1 = new BookMangement("Java Programming");
        BookMangement b2 = new BookMangement("Python Programming", "Anurag");
        BookMangement b3 = new BookMangement("C++ Programming", "Anurag", 500);
        b1.display();
        b2.display();
        b3.display();
    }
}
