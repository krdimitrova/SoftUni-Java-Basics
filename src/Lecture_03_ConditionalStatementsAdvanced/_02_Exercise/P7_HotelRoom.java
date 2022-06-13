package Lecture_03_ConditionalStatementsAdvanced._02_Exercise;

import java.util.Scanner;

public class P7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        switch (month) {
            case"May":
            case "October":
                studioPrice = nights * 50.0;
                apartmentPrice = nights * 65.0;
                break;
            case "June":
            case "September":
                studioPrice = nights * 75.20;
                apartmentPrice = nights * 68.70;
                break;
            case "July":
            case "August":
                studioPrice = nights * 76.0;
                apartmentPrice = nights * 77.0;
                break;
        }
        if (month.equals("May") || month.equals("October")) {
            if (nights > 14){
                studioPrice *= 0.70;
                apartmentPrice *= 0.90;
            } else if (nights > 7) {
                studioPrice *= 0.95;
            }
        } else if ((month.equals("June") || month.equals("September")) && nights > 14) {
            studioPrice *= 0.80;
            apartmentPrice *= 0.90;
        } else if ((month.equals("July") || month.equals("August")) && nights > 14) {
            apartmentPrice *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv. %n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
