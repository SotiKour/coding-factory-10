package gr.aueb.cf.ch12;

public class Account {
    private long id;
    private String iban;
    private String firstName;
    private String lastName;
    private String ssn;
    private double balance;

    public Account() {

    }

    public Account(long id, String iban, String firstName, String lastName,
                   String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public API - Contract
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("The Amount must not be negative");
            }
            balance += amount;
            //audit trail: who, when, what, initial balance, resulting balance
        } catch (Exception e) {
            System.err.printf("Negative amount = %f is not allowed. \n%s\n", amount, e.getMessage());
            throw e;
        }




    }
}
