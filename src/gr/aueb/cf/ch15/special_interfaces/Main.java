package gr.aueb.cf.ch15.special_interfaces;

import gr.aueb.cf.ch11.Product;

public class Main {

    public static void main(String[] args) {
        IProduct book = new Book();
        CompactDisk cd = new CompactDisk();

        deliver(book);
        deliver(cd);
    }

    public static void deliver(IProduct product) {
        if  (product instanceof Book) {
            System.out.println("delivering Book");
        } else if (product instanceof CompactDisk) {
            System.out.println("delivering CD...");
        } else {
            throw new IllegalArgumentException("Invalid product type");
        }
    }
}
