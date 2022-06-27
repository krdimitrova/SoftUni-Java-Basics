package MoreExercises._03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P2_BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double sumJuniors = 0;
        double sumSeniors = 0;
        double discount = 0;

        switch (trace) {
            case "trail":
                sumJuniors = juniors * 5.50;
                sumSeniors = seniors * 7;
                break;
            case "cross-country":
                sumJuniors = juniors * 8;
                sumSeniors = seniors * 9.50;

                if (juniors + seniors >= 50) {
                    discount = 0.25;
                }

                break;
            case "downhill":
                sumJuniors = juniors * 12.25;
                sumSeniors = seniors * 13.75;
                break;
            case "road":
                sumJuniors = juniors * 20;
                sumSeniors = seniors * 21.50;
                break;
        }

        double totalSum = sumJuniors + sumSeniors - ((sumJuniors + sumSeniors) * discount);


        totalSum -= totalSum * 0.05;

        System.out.printf("%.2f", totalSum);
    }
}
