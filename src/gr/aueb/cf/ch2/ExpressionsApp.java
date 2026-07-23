package gr.aueb.cf.ch2;

/**
 * Expressions Demo
 * Pizza App Calculator
 */

public class ExpressionsApp {

    public static void main(String[] args) {
        int bestFriends = 4;
        int pizzasOrdered = 387;
        int slicesPerPizza = 8;

        int totalSlices = 0;
        int slicesPerPerson = 0;
        int leftOverSlices = 0;
        int aliceSlices = 0;

        int wallet = 50;
        int pizzaCost = 12;
        int drinkCost = 3;
        int totalBill = 0;
        int finalBill = 0;
        int costPerPerson = 0;
        int remainder = 0;
        int beforeArrival = 0;

        final int DISCOUNT = 10; // 10% DISCOUNT


        // Βασικές πράξεις
        beforeArrival = bestFriends++;
        totalSlices = pizzasOrdered * slicesPerPizza;       //24
        slicesPerPerson = totalSlices / bestFriends;            //4
        leftOverSlices = totalSlices % bestFriends;             //4

        aliceSlices = slicesPerPerson;
        --aliceSlices;                                     // Έφαγε ένα κομμάτι η Alice

        // Wallet Calculator
        wallet += 10;                                      // Μας χρώσταγε ένας φίλος
        wallet -= 5;                                       // Χρωστάγαμε 5 ευρώ


        totalBill = (pizzasOrdered * slicesPerPizza) + (drinkCost * bestFriends);
        finalBill = totalBill - (totalBill * DISCOUNT / 100);
        costPerPerson = finalBill / bestFriends;
        remainder = finalBill % bestFriends;

        System.out.printf("Κομμάτια: %d, Ανά άτομο: %d, Επιπλέον: %d, Alice: %d, Wallet: %d, Άτομα: %d%n",
                totalSlices, slicesPerPerson, leftOverSlices, aliceSlices, wallet, bestFriends);

        System.out.printf("Λογαριασμός: %,d, Με έκπτωση: %,d, Ανά άτομο: %,d, Επιπλέον: %,d",
                totalBill, finalBill, costPerPerson, remainder);


    }


}
