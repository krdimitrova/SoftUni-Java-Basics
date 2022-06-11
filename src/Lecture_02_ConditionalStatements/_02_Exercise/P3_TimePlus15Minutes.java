package Lecture_02_ConditionalStatements._02_Exercise;

import java.util.Scanner;

public class P3_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        int minutes = minute + 15;

        if(minutes>59) {
            minutes -= 60;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
        if (minutes < 10) {
            System.out.printf("%d:%02d", hour, minutes);
        } else {
            System.out.printf("%d:%d", hour, minutes);
        }

    }
}
