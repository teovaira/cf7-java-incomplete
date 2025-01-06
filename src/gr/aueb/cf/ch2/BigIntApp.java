package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Biginteger class demo
 */
public class BigIntApp {

    public static void main(String[] args) {

        //declarations kai initialiazations
        BigInteger bigNum1 = new BigInteger("123456789");
        BigInteger bigNum2 = new BigInteger("12345678");
        BigInteger result;
        /*δεν αρχικοποιησαμε εδω διοτι θελουμε να χουμε εναν μπουσουλα. πρω
        πρωτα αρχικοποιησεις, μετα εντολες και μετα εκτυπωσεις. εχυμε πει οτι καλο
        ειναι να μην μενουν απροσδιοριστα στη μνημη τα περιεχομενα μιας μεταβλητης αλλα αυτο
        ισχυει κυριως για τους primitives και επειδη γενικοτερα δεν θελουμε αργοτερα να ξεχασουμε
        να αρχικοποιησουμε καποια μεταβλητη και προκυψει error
         */
        //commands
        result = bigNum1.add(bigNum2);

        //printing the results
        System.out.printf("%,d", result);
    }
}
