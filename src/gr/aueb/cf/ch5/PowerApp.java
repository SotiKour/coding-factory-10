package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη a^b με μέθοδο
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        System.out.println("Please enter a base!");
        base = scanner.nextInt();
        System.out.println("Please enter a power!");
        power = scanner.nextInt();

        result = pow(base, power);
        System.out.printf("The result of %d and %d is: %d%n ", base, power, result);
    }

    /**
     * Calculates a^b
     * @param a the base number
     * @param b the exponent
     * @return  the result of a^b
     */
    public static int pow(int a, int b){
        int result = 1;

        for (int i = 1; i <= b; i++){
            result *= a;            // accumulator
        }
        return result;
    }
}
