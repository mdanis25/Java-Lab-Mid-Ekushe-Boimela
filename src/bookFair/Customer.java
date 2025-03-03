package bookFair;

public class Customer {
    private String name, nationalId, deliveryAddress, contactInfo;
    Book [] purchaseBookList;

    public Customer(String name, String nationalId, String deliveryAddress, String contactInfo) {
        this.name = name;
        this.nationalId = nationalId;
        this.deliveryAddress = deliveryAddress;
        this.contactInfo = contactInfo;
        this.purchaseBookList = new Book[3]; // Customer can purchase 3 books
    }

    public void purchase(Book book) {
        for(int i = 0; i < purchaseBookList.length; i++) {
            if(purchaseBookList[i] == null) {
                purchaseBookList[i] = book;
                break;
            }
        }
    }

    // Method to visit a book stall
    public void visitBookStall(BookStall bookStall) {
        System.out.println(name + " is visiting the book stall: " + bookStall.name);
        for (Book book : bookStall.bookList) {
            book.showDetails();
        }
    }


    // Method to show personal info
    public void showPersonalInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("National ID: " + nationalId);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Purchased Books:");
        for (Book book : purchaseBookList) {
            if (book != null) {
                book.showDetails();
            }
        }
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }


}
