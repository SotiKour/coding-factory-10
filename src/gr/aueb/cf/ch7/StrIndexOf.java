package gr.aueb.cf.ch7;

public class StrIndexOf {
    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');       // 1
        int positionOfLasto =s.lastIndexOf('o');    //11
    }

    // Μέθοδος που επιστρέφει την κατάληξη του ονόματος ενός αρχείου, π.χ. αν έχουμε coding.txt -> txt
    public static String getExtension(String str){

        int positionOfDot = str.lastIndexOf('.');
        return str.substring(positionOfDot + 1);




    }
}
