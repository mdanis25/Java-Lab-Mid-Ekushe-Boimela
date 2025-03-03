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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}