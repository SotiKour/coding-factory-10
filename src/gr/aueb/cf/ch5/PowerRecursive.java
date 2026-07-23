package gr.aueb.cf.ch5;

/**
 * Υπολογίζει τη δύναμη του n με αναδρομικό τρόπο. base ^ power = base * base ^ (power - 1)
 */

public class PowerRecursive {
    public static void main(String[] args) {
        int result = 0;
        int n = 5;
        int power = 3;

        result = pow(n, power);
        System.out.println("the power of " + n + " at " + power + " is " + result);
    }

    public static int pow(int n, int power) {
//        if (power == 0) {
//            return 1;
//        }
//        return n * pow(n, power - 1);

        return power == 0 ? 1 : n * pow(n, power - 1);
    }
}
