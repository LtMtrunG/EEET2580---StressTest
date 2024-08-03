package eeet2580.stress_test_4.user_profile;

public class UserProfile {
    
    private String name;
    private String id;
    private double balance;

    public UserProfile(String name, String id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double  getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
