package gr.aueb.cf.review;

import java.util.Scanner;

/**
 * Ένας αριθμός Armstrong είναι ένας ακέραιος αριθμός που είναι ίσος με το άθροισμα των ψηφίων του
 * όπου το κάθε ψηφίο έχει υψωθεί στη δύναμη του αριθμού των ψηφίων. Για παράδειγμα 153 = 1^3 + 5^3 + 3^3
 */


public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a number to check if it is Armstrong: ");
        num = scanner.nextInt();

        System.out.printf("The number %d is Armstrong: %s\n", num, isArmstrong(num));

    }

    public static boolean isArmstrong(int num) {
        int numberOfDigits = 0;
        int digit = 0;
        int temp = 0;
        int sum = 0;


        // Πρώτα βρίσκουμε το πλήθος των ψηφίων με διαδοχικές διαιρέσεις
        temp = num;
        while (temp != 0) {
            numberOfDigits++;
            temp /= 10;             // temp = temp / 10;
        }

        // Βρίσκουμε το κάθε ψηφίο με mod 10 και προσθέτουμε
        // στο sum το ψηφίο υψωμένο στη δύναμη του πλήθους των ψηφίων
        temp = num;
        while (temp != 0) {
            digit = temp % 10;          //
            sum += (int) Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return sum == num;
    }
}
