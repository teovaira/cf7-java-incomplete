package gr.aueb.cf.ch2;

/**
 Λαμβάνει από τον χρήστη έναν διψήφιο ακέραιο
 και υπολογίζει και εκτυπώνει το άθροισμα των ψηφίων του
 Για παράδειγμα αν ο χρήστης δώσει τον αριθμό 15
 τότε το αποτέλεσμα που πρέπει να λάβει
θα είναι 1 + 5 = 6.
*/

import java.util.Scanner;

public class DigitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;

        System.out.println("Please insert a two-digit integer.");
        inputNum = in.nextInt();
        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Ο χρήστης δίνει %d και το άθροισμα των ψηφίων του %d, %d είναι: %d\n", inputNum, leftDigit, rightDigit, sum);


    }
}
