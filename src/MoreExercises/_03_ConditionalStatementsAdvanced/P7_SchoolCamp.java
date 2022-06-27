package MoreExercises._03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P7_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        String sport = "";

        switch (season) {
            case "Winter":

                switch (group) {
                    case "boys":
                        price = students * nights * 9.60;
                        sport = "Judo";
                        break;
                    case "girls":
                        price = students * nights * 9.60;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        price = students * nights * 10.00;
                        sport = "Ski";
                        break;
                }
                break;

            case "Spring":

                switch (group) {
                    case "boys":
                        price = students * nights * 7.20;
                        sport = "Tennis";
                        break;
                    case "girls":
                        price = students * nights * 7.20;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        price = students * nights * 9.50;
                        sport = "Cycling";
                        break;
                }

                break;

            case "Summer":

                switch (group) {
                    case "boys":
                        price = students * nights * 15.00;
                        sport = "Football";
                        break;
                    case "girls":
                        price = students * nights * 15.00;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        price = students * nights * 20.00;
                        sport = "Swimming";
                        break;
                }

                break;
        }

        if (students >= 50) {
            price -= price * 0.50;
        } else if (students >= 20) {
            price -= price * 0.15;
        } else if (students >= 10) {
            price -= price * 0.05;
        }

        System.out.printf("%s %.2f lv.", sport, price);

    }
}
