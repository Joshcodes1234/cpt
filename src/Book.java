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
