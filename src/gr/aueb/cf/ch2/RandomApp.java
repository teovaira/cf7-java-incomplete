package gr.aueb.cf.ch2;

/**
 *  Random demo
 */
public class RandomApp {

    public static void main(String[] args) {
        //χωρις την παρενθεση το int θα αφορα τη random γιατι αυτη ακολουθει οποτε θα δινει παντα 0 και +1 το αποτελεσμα θα ειναι παντα ενα
        int die = (int) (Math.random() * 6 + 1);
        System.out.println(die);

/*
        int num1 = 0, num2 = 1, sum = 0;
        sum = num1 + num2;
        System.out.println(num1 + "" + num2 + "" + sum );
*/


    }
}
