import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


// public static void main(String[] args) {
// }


public class LibraryManager {

ArrayList<Book>books;


public LibraryManager() {
        this.books = new ArrayList<>();
    }



public void addResource(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    public void deleteBook(Book book) {
        if (books.contains(book)) {  // Check if the book exists in the list
                books.remove(book);  // Remove the book from the list
                System.out.println("Book deleted successfully!");
            } else {
                System.out.println("Book not found!");  // Print message if the book isn't found
            }
        }
        
    
    
    public void searchBooks(String query) {
        // ChatGPT helpmed me with this prompt: 
        List<Book> foundBooks = new ArrayList<>();
        
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        
        if (foundBooks.isEmpty()) {
            System.out.println("No books found.");
        } else {
            for (Book book : foundBooks) {
                System.out.println(book);
            }
        }
    }
    


}



        
    