package gr.aueb.cf.ch4;

/**
 * Εκτυπώνουμε οριζόντια, κάθετα, από 1 έως 10, από 10 έως 1,
 * 10 χ 10 αστεράκια
 */

public class Stars {

    public static void main(String[] args) {


        //Δέκα οριζόντια αστεράκια
        for (int i = 1 ; i <= 10; i++){
            System.out.print("*");
        }

        //Δέκα κάθετα αστεράκια
        for (int i = 0; i <= 10; i++){
            System.out.println("*");
        }

        //10 Χ 10 Αστεράκια
        for (int i = 0; i<=10; i++){
            for (int j = 0; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 1η γραμμή 1, 2η γραμμή 2. 3η γραμμή 3, ... , stars
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 1η γραμμή 10 αστεράκια, η 2η γραμμή 2 αστεράκια, .... , 10η γραμμή 1 αστεράκια
        for (int i = 1; i <= 10; i++){
            for (int j = i; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
