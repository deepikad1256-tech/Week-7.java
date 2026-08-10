class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating Author object
        Author author = new Author(
            "R. K. Narayan",
            "rknarayan@example.com",
            'M'
        );

        // Creating Book object
        Book book = new Book(
            "Malgudi Days",
            author,
            450.50,
            10
        );

        // Printing Book details
        System.out.println("Book Details");
        System.out.println("--------------------");
        System.out.println("Book Name      : " + book.getName());
        System.out.println("Price          : " + book.getPrice());
        System.out.println("Quantity Stock : " + book.getQtyInStock());

        // Printing Author details
        System.out.println("\nAuthor Details");
        System.out.println("--------------------");
        System.out.println("Author Name    : " + book.getAuthor().getName());
        System.out.println("Author Email   : " + book.getAuthor().getEmail());
        System.out.println("Author Gender  : " + book.getAuthor().getGender());
    }
}