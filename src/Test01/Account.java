package  Test01;

public class Account {
    public String name; // Can excess anywhere
    protected String email; // can excess in same package and also can excess in different sub class
    private String password; // Private can only excess in same class
    // To excess private classes we use "Getter & Setter".

    public Account(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter and Setter for private class to excess in another class
    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        this.password = password;
        return password;
    }

    public void displayDetails() {
        System.out.println("Account Holder name is: " + name);
        System.out.println("Account Holder email is: " + email);
        System.out.println("Account Holder password is: " + password);
    }

    // Subclass inheriting from account class
    public static class SavingAcccount extends Account {
        private double balance;

        public SavingAcccount(String name, String email, String password) {
            super(name, email, password);// Call to superrclass constructor
            this.balance = balance;
        }

        public void displaysavingDetails() {
            displayDetails(); // call to superclass method
            System.out.println("Saving account balance: " + balance);
        }
    }

}