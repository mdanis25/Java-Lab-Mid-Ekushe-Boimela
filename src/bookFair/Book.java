package bookFair;

public class Book {
    private String name, author;
    private  int numberOfCopyAvailable;
    private double price;

    public Book(String name, String author, int numberOfCopyAvailable, double price) {
        this.name = name;
        this.author = author;
        this.numberOfCopyAvailable = numberOfCopyAvailable;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Book Name: " + this.name + "\nAuthor: " + this.author + "\nCopies Available: " + this.numberOfCopyAvailable + "\nPrice: " + this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfCopyAvailable() {
        return numberOfCopyAvailable;
    }

    public void setNumberOfCopyAvailable(int numberOfCopyAvailable) {
        this.numberOfCopyAvailable = numberOfCopyAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
