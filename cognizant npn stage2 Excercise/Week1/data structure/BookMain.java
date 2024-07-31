public class BookMain {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(10);

        Book book1 = new Book(1, "And then there were none", "Agatha Christie");
        Book book2 = new Book(2, "The Casual Vacancy", "J.K. Rowling");
        Book book3 = new Book(3, "Paper Towns", "John Green");
        Book book4 = new Book(4, "One of us is lying", "Karen Mcmanus");

        lms.addBook(book1);
        lms.addBook(book2);
        lms.addBook(book3);
        lms.addBook(book4);

        System.out.println("Books after adding:");
        lms.traverseBooks();

        System.out.println("\nSearching for 'Paper Towns' using linear search:");
        Book foundBookLinear = lms.linearSearchByTitle("Paper Towns");
        if (foundBookLinear != null) {
            System.out.println(foundBookLinear);
        } else {
            System.out.println("Book not found.");
        }

        lms.sortBooksByTitle();

        System.out.println("\nSearching for 'Paper Towns' using binary search:");
        Book foundBookBinary = lms.binarySearchByTitle("Paper Towns");
        if (foundBookBinary != null) {
            System.out.println(foundBookBinary);
        } else {
            System.out.println("Book not found.");
        }
    }
}