package gr.aueb.cf.ch2;

public class DateApp {

    public static void main(String[] args) {
        int day = 10;
        int month = 7;
        int year = 2024;

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομηνία είναι:%d/%02d/%,d", day, month, year);
    }
}
