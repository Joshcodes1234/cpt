import java.util.Scanner;

public class LibraryManager {
   
        private static final int MAX_BOOKS = 50; // Constant for maximum books
}


class Book {
        private String title;
        private String author;
        private boolean isborrowed;
    
        public Book(int id, String title, String author) {
            this.title = title;
            this.author = author;
            this.isborrowed = false;
        }
        // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isborrowed;
    }

   

    // toString method for easy display of book details
    @Override
    public String toString() {
        return "Book{Title: " + title + ", Author: " + author + ", Available: " + isborrowed + "}";
    }
} 

class User {
    private String name;
    private int userId;
    

    // Constructor
    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
       }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    // toString method to display user information
    @Override
    public String toString() {
        return "User{Name: " + name + ", ID: " + userId + "}";
    }
}



        
    