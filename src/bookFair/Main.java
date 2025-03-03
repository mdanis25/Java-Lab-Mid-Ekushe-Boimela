package bookFair;

public class Main {
    public static void main(String[] args) {
        // Creating Books with realistic data
        Book book1 = new Book("ভাঙা মন", "হুমায়ূন আহমেদ", 5, 250);
        Book book2 = new Book("জীবন থেকে বড় কিছু নয়", "ফয়সল খান", 3, 300);
        Book book3 = new Book("আলোর পথ", "নাজরুল ইসলাম", 2, 400);
        Book book4 = new Book("অনন্ত ভালোবাসা", "তানিয়া", 4, 150);
        Book book5 = new Book("বঙ্গবন্ধুর জীবন", "শেখ মুজিবুর রহমান", 6, 350);
        Book book6 = new Book("ঢাকা শহরের ইতিহাস", "এল. বি. সরকার", 8, 200);
        Book book7 = new Book("বাংলাদেশের মুক্তিযুদ্ধ", "মুক্তিযুদ্ধ গবেষক", 5, 450);
        Book book8 = new Book("মধুমালতি", "রবীন্দ্রনাথ ঠাকুর", 7, 300);
        Book book9 = new Book("ভাটির দেশ", "শহীদুল জহির", 4, 250);
        Book book10 = new Book("মা", "কাজী নজরুল ইসলাম", 3, 600);
        Book book11 = new Book("চোখের পানি", "জহির রায়হান", 10, 200);
        Book book12 = new Book("আমার দেশ", "সেলিনা হোসেন", 2, 700);
        Book book13 = new Book("গল্পের শহর", "আহমেদ সামী", 5, 320);
        Book book14 = new Book("মেঘে মেঘে", "মাহবুবুল হক", 4, 500);
        Book book15 = new Book("দ্য ফিউচার অফ বাংলাদেশ", "সামসুল আলম", 9, 400);



        // Creating BookStalls with realistic data
        Book[] stall1Books = {book1, book2, book3, book4, book5}; // Books for Stall 1
        Book[] stall2Books = {book6, book7, book8, book9, book10}; // Books for Stall 2
        Book[] stall3Books = {book11, book12, book13, book14, book15}; // Books for Stall 3

        // Creating BookStalls
        BookStall stall1 = new BookStall("মুক্তিযুদ্ধের বইয়ের স্টল", "ঢাকা, মিরপুর", "01712345678", 10000, stall1Books); // Stall 1: Liberation War Books Stall
        BookStall stall2 = new BookStall("বাংলাদেশ সাহিত্য স্টল", "ঢাকা, গুলশান", "01887654321", 15000, stall2Books); // Stall 2: Bangladeshi Literature Stall
        BookStall stall3 = new BookStall("বিশ্ববিদ্যালয়ের স্টল", "ঢাকা, ধানমন্ডি", "01922334455", 20000, stall3Books); // Stall 3: University Books Stall

        // Creating Customers
        Customer customer1 = new Customer("Anis", "123456789", "Dhaka", "987654321");
        Customer customer2 = new Customer("Shihab", "987654321", "Chittagong", "123456789");
        Customer customer3 = new Customer("Rahim", "111223344", "Sylhet", "543212345");
        Customer customer4 = new Customer("Karim", "223344556", "Rajshahi", "9988776655");
        Customer customer5 = new Customer("Rina", "334455667", "Khulna", "1122334455");

        // Customers visiting stalls and purchasing books
        customer1.visitBookStall(stall1);
        customer1.purchase(book1);
        customer1.purchase(book3);
        customer1.purchase(book5);

        customer2.visitBookStall(stall2);
        customer2.purchase(book6);
        customer2.purchase(book8);
        customer2.purchase(book10);

        customer3.visitBookStall(stall3);
        customer3.purchase(book11);
        customer3.purchase(book13);
        customer3.purchase(book15);

        customer4.visitBookStall(stall1);
        customer4.purchase(book2);
        customer4.purchase(book4);
        customer4.purchase(book7);

        customer5.visitBookStall(stall2);
        customer5.purchase(book9);
        customer5.purchase(book12);
        customer5.purchase(book14);

        // Showing all details
        System.out.println("Customer 1 Details:");
        customer1.showPersonalInfo();
        System.out.println("\nCustomer 2 Details:");
        customer2.showPersonalInfo();
        System.out.println("\nCustomer 3 Details:");
        customer3.showPersonalInfo();
        System.out.println("\nCustomer 4 Details:");
        customer4.showPersonalInfo();
        System.out.println("\nCustomer 5 Details:");
        customer5.showPersonalInfo();


    }
}
