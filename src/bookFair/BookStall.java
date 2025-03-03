package bookFair;

public class BookStall {
    String name;
    private String address;
    private String contactInfo;
    private double balance;
    Book[] bookList;

    public BookStall(String name, String address, String contactInfo, double balance, Book[] bookList) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.balance = balance;
        this.bookList = bookList;
    }

    public void showDetails() {
        System.out.println("Stall Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Balance: " + balance + " BDT");
        System.out.println("Books Available in this Stall:");
        for (Book book : bookList) {
            book.showDetails();
        }
    }

}