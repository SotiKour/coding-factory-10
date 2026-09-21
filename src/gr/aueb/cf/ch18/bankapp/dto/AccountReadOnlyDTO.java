package gr.aueb.cf.ch18.bankapp.dto;

import java.math.BigDecimal;

//Για τα DTO θα χρησιμοποιούμε record λόγω immutable
public record AccountReadOnlyDTO(String iban, BigDecimal balance) {

    @Override
    public String toString() {
        return "IBAN: " + iban + ", BALANCE: " + balance;
    }
}






//public class AccountReadOnlyDTO {                                       // JAVA BEANS
//    private String iban;
//    private BigDecimal balance;
//
//    public AccountReadOnlyDTO() {
//
//    }
//
//    public AccountReadOnlyDTO(String iban, BigDecimal balance) {
//        this.iban = iban;
//        this.balance = balance;
//    }
//
//    public String getIban() {
//        return iban;
//    }
//
//    public void setIban(String iban) {
//        this.iban = iban;
//    }
//
//    public BigDecimal getBalance() {
//        return balance;
//    }
//
//    public void setBalance(BigDecimal balance) {
//        this.balance = balance;
//    }
//
//    @Override
//    public String toString() {
//        return "IBAN: " + iban + ", BALANCE: " + balance;
//    }
//}
