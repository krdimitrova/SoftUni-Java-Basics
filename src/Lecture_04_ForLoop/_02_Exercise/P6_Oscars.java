package Lecture_04_ForLoop._02_Exercise;

import java.util.Scanner;

public class P6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double pointsActor = 0.0;
        double pointsInTotal = 0.0;

        for (int i = 1; i <= n; i++) {
            String juri = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            pointsActor += (juri.length() * points) /2;
            pointsInTotal = pointsFromAcademy + pointsActor;

            if (pointsInTotal >= 1250.50) {
                break;
            }
        }

        if (pointsInTotal >= 1250.50)  {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, pointsInTotal);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.50 - pointsInTotal);
        }
    }
}
