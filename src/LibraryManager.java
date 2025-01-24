import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;




public class LibraryManager {

    public static void main(String[] args) {
        LibraryManager x = new LibraryManager();
        x.showMenu();//Runs the menu method
    }
    

ArrayList<Book>books;
LinkedList<User>users; 
public void showMenu() {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {//Menu
        System.out.println("\n--- Library Management System ---");
        System.out.println("1. Add Book");//Add Book
        System.out.println("2. Remove Book");//Remove Book
        System.out.println("3. Search Book");//Search Book
        System.out.println("4. Add User");//Add User
        System.out.println("5. Display Books");// Display Books
        System.out.println("6. Dispay Users");// Display Books
        System.out.println("7. Exit");//Exit
        System.out.print("Choose an option: ");//choice
        choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:// Switch Statement for add book
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                addBook(new Book(title, author));
                break;
            case 2:// Enter book title to remove
                System.out.print("Enter book title to remove: ");
                title = scanner.nextLine();
               
            deleteBook(new Book(title));
            break;
            case 3:
            System.out.print("Enter book title to search: ");
            title = scanner.nextLine();
                                
            searchBooks(title);
            break;
            case 4:
            System.out.print("Enter user name: ");
            String userName = scanner.nextLine();
            addUser(new User(userName));
            break;
            case 5: 
            displayAvailableBooks();
            case 6:
            displayUsers();
            break;
            case 7:
            System.out.println("Exiting system...");
            break;
            default:
            System.out.println("Invalid choice. Please try again.");
                }   
            } while (choice != 5);
        }
                

                
                
                
                public LibraryManager() {
                        this.books = new ArrayList<>();
                        this.users = new LinkedList<>();
                    }
                
                
                
                public void addBook(Book book) {
                        books.add(book);
                        System.out.println(book.getTitle() + " added to the library.");
                    }
                
                    public void displayAvailableBooks() {
                        System.out.println("Available Books:");// Prompt
                        for (int i = 0; i < books.size(); i++) {
                            Book book = books.get(i);
                            if (book.isAvailable()) {//if book is available displays book
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
        // ChatGPT helpmed me with this prompt(all it does is search the list 
        //to determine if the book is in the list): 
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
    
    private Book inputBookDetails(Scanner scanner) {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        
        return new Book(title, author);


}

public void addUser(User user) {
    users.add(user);
    System.out.println( user.getName() + " has been added to the library system.");
}


public void displayUsers() {
    if (users.isEmpty()) {
        System.out.println("No users found.");
    } else {
        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println(user);
        }
    }
}


private User inputUserDetails(Scanner scanner) {
    System.out.print("Enter User Name: ");
    String name = scanner.nextLine();


    int userId;
    while (true) {
        System.out.print("Enter User ID (must be 4 digits or more): ");
        userId = scanner.nextInt();
        scanner.nextLine(); // Allows user to input ID 


        if (userId >= 9999) {
            break; // Exit the loop if the User ID is valid
        } else {
            System.out.println("Invalid User ID. Please enter a number with 4 or more digits.");
        }
    }


    return new User(name, userId);
}
}




        
    