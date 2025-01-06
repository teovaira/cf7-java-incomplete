package gr.aueb.cf.ch1;

/**
 * calculates the sum of two integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {
        //δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //εντολές. πρόκειται για μια παράσταση το ακόλουθο
        result = num1 + num2;

        //εκτύπωση του αποτελέσματους. "είναι παράσταση: result"
        System.out.println("Το αποτέλεσμα είναι:" + result);
        System.out.println("Το άθροισμα των " + num1 + "," + num2 + " είναι ίσο με: " + result);
        System.out.printf("Το άθροισμα των %d,%d είναι ίσο με: %d\n", num1, num2, result);
        System.out.println(result);
    }
}
