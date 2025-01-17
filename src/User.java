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