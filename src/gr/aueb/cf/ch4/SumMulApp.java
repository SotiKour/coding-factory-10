package gr.aueb.cf.ch4;

/**
 * Υπολογίζει και εκτυπώνει το άθροισμα και το γινόμενο των ακεραίων από 1 έως 10
 */

public class SumMulApp {
    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση
        int sum = 0;
        int mul = 1;

        // Επεξεργασία Δεδομένων
        for (int i = 1; i <= 10; i++){
            sum += i;       // sum = sum + i;
            mul *= i;       // mul = mul * i;
        }

        // Εκτυπώσεις
        System.out.printf("Το άθροισμα των ακεραίων από 1 έως 10 είναι: %d", sum);
        System.out.printf("Το γινόμενο των ακεραίων από 1 έως 10 είναι: %d", mul);
    }
}
