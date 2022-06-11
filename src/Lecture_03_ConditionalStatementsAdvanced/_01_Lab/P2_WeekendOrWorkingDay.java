package Lecture_03_ConditionalStatementsAdvanced._01_Lab;

import java.util.Scanner;

public class P2_WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "Monday":
                System.out.println("Working day");
                break;
            case "Tuesday":
                System.out.println("Working day");
                break;
            case "Wednesday":
                System.out.println("Working day");
                break;
            case "Thursday":
                System.out.println("Working day");
                break;
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
