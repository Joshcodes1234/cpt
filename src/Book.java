class Book {
    private String title;
    private String author;
    private boolean isborrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isborrowed = false;
    }
    public Book(String title) {
        this.title = title;
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
        return String.format("%-10s %-10s\t%-35s\t%-15s", title, author);
    }
}
