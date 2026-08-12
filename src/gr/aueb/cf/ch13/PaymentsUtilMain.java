package gr.aueb.cf.ch13;

import java.math.BigDecimal;

public class PaymentsUtilMain {

    public static void main(String[] args) {
        BigDecimal firstPayment = new BigDecimal("1000.05245854");
        BigDecimal secondPayment = new BigDecimal("800.05245854");

        BigDecimal roundedFirstPayment = PaymentsUtil.round(firstPayment, 2);
        BigDecimal roundedSecondPayment = PaymentsUtil.round(secondPayment, 2);

        System.out.println("roundedFirstPayment: " + roundedFirstPayment);
        System.out.println("roundedSecondPayment: " + roundedSecondPayment);

        BigDecimal diff = PaymentsUtil.diff(roundedFirstPayment, roundedSecondPayment, 2);
        System.out.println("Difference: " + diff);
    }
}
