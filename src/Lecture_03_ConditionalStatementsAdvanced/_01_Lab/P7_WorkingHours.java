package Lecture_03_ConditionalStatementsAdvanced._01_Lab;

import java.util.Scanner;

public class P7_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day) || "Saturday".equals(day)) {
            if (hour>= 10 && hour<= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if ("Sunday".equals(day)) {
            System.out.println("closed");
        }
    }
}
