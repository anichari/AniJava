public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("J K Rowling", "Harry Potter and the Chamber of Secrets" , "Children's", 340);
        Book b2 = new Book("J K Rowling", "Harry Potter and the Socerer's Stone", "Children's", 300);

        b1.printData();
        System.out.println();
        b2.printData();

    } // end main
}
