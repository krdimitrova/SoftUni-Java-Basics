package Lecture_03_ConditionalStatementsAdvanced._02_Exercise;

import java.util.Scanner;

public class P8_OnTimeForTheExam {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int examHour =Integer.parseInt(scanner.nextLine());
    int examMinute =Integer.parseInt(scanner.nextLine());
    int arrivingHour =Integer.parseInt(scanner.nextLine());
    int arrivingMinute =Integer.parseInt(scanner.nextLine());

    int examTime = examHour * 60 + examMinute;
    int arrivingTime = arrivingHour * 60 + arrivingMinute;
    String status = "";
    String output = "";

    if (arrivingTime < examTime - 30) {
        status = "Early";
        int diff = examTime - arrivingTime;
        if (diff < 60) {
            output = String.format("%d minutes before the start", diff);
        } else  {
            int h = diff/60;
            int m = diff % 60;
            output = String.format("%d:%02d hours before the start", h,m);
        }
    } else if (arrivingTime <= examTime) {
        status = "On time";
        int diff = examTime - arrivingTime;
        output = String.format("%d minutes before the start", diff);
    } else {
        status = "Late";
        int diff = arrivingTime - examTime;
        if (diff < 60) {
            output = String.format("%d minutes after the start", diff);
        } else  {
            int h = diff/60;
            int m = diff % 60;
            output = String.format("%d:%02d hours after the start", h,m);
        }
    }
    System.out.println(status);
    System.out.println(output);
}
}
