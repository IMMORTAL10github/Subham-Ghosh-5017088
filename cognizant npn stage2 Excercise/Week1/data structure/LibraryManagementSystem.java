import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystem {
    private Book[] books;
    private int size;
    private int capacity;

    public LibraryManagementSystem(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.size = 0;
    }

    
    public void addBook(Book book) {
        if (size == capacity) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        books[size] = book;
        size++;
    }

    
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    
    public Book binarySearchByTitle(String title) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = books[mid].title.compareToIgnoreCase(title);
            if (comparison == 0) {
                return books[mid];
            }
            if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    
    public void sortBooksByTitle() {
        Arrays.sort(books, 0, size, Comparator.comparing(book -> book.title.toLowerCase()));
    }

    
    public void traverseBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}