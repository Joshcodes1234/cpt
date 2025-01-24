class User {
    private String name;
    private int userId;
    

    // Constructor
    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
       }
       public User(String name) {
        this.name = name;
        
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
        return String.format("%-10s %-10s\t%-35s\t%-15s", name, userId);
    }
}