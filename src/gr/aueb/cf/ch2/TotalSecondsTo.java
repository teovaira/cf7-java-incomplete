package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TotalSecondsTo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int DAY_SECONDS = 86400;
        final  int HOUR_SECONDS = 3600;
        final int MINUTE_SECONDS = 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;

        System.out.println("Please insert an amount of seconds:");
        int inputSeconds = in.nextInt();

        days = inputSeconds / DAY_SECONDS;
        remainingSeconds = inputSeconds % DAY_SECONDS;

        hours = remainingSeconds / HOUR_SECONDS;
        remainingSeconds %= HOUR_SECONDS;

        minutes = remainingSeconds / MINUTE_SECONDS;
        remainingSeconds %= MINUTE_SECONDS;

        System.out.printf("The amount %,d is: %,d days, %d hours, %d minutes and %d seconds", inputSeconds, days, hours, minutes, remainingSeconds);

    }
}
