package gr.aueb.cf.ch2;

/**
 * Typecast demo
 */
public class TypecastApp {

    public static void main(String[] args) {
        int num1 = 10; // int literals - int -. 32-bit
        long num2 = 20L; /*θα το κανει αυτοματα η java γιατι το 20 είναι int και χωραει στο long
        * αλλα βοηθαμε με το type suffix L
        */

        num1 = (int) num2;
    }
}
