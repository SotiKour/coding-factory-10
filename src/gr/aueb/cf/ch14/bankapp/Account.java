package gr.aueb.cf.ch14.bankapp;

import java.util.Objects;

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
    /**
     * Deposit a specifi amount of money into the account.
     *
     * @param amount        the amount of money to deposit.
     * @throws Exception    if the amount is Negative.
     */
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

    /**
     * Withdraw a specific amount of money from the account!
     * @param amount            the amount of money to withdraw
     * @param ssn               the SSN od the account holder
     * @throws Exception        if the amount is negative, the balance is insufficient,
     *                          or the SSn does not match.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (amount < 0) throw new Exception("The Amount must not be negative!");
            if (amount > balance) throw new Exception("The balance is not sufficient!");
            if (!isSsnValid(ssn)) throw new Exception("The SSN does not much!");
            balance -= amount;
            //Audit trail: who, when, what, initial balance, resulting balance
        } catch (Exception e){
            System.err.printf("Withdrawal failed. \n%s\n", e.getMessage());
            throw e;
        }

    }

    //Design pattern - Delegation

    /**
     * Get the account balance.
     * @return  the account balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    private boolean isSsnValid(String ssn) {
//      return this.ssn.equals(ssn);                // not null-safe
        return Objects.equals(this.ssn, ssn);       // null-safe
    }


}
