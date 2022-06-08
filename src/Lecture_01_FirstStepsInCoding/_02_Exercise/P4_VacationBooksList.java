package Lecture_01_FirstStepsInCoding._02_Exercise;

import java.util.Scanner;

public class P4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesCurrentBook = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int allTime = pagesCurrentBook / pagesForHour;
        int hours = allTime / days;

        System.out.println(hours);
    }
}
