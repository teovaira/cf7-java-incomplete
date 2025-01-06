package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {

        for (int b = 1, p = 1; b <= 10; b++, p++) {
            System.out.printf("%,d\n", pow(b, p));
        }
//        Scanner sc = new Scanner(System.in);
//        long a = 2L;
//        long n = 100L;
//        System.out.println("Η δύναμη του 2^100 είναι: " + Math.pow(a, n));
    }

    /**
     * Calculates a^n.
     * Delegation / Forwarding.
     *
     * @param a     the base.
     * @param n     the power.
     * @return      the base raised to the power.
     */
    public static long pow(long a, long n) {
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result = result * a;
//        }
//        return result;
        return (long) Math.pow(a, n);
    }
}