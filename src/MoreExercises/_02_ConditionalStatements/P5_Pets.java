package MoreExercises._02_ConditionalStatements;

import java.util.Scanner;

public class P5_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double foodForDog = Double.parseDouble(scanner.nextLine());
        double foodForCat = Double.parseDouble(scanner.nextLine());
        double foodForTurtle = Double.parseDouble(scanner.nextLine());

        double totalDogsFood = foodForDog * days;
        double totalCatsFood = foodForCat * days;
        double totalTurtlesFood = (foodForTurtle / 1000) * days;

        double totalFood = totalDogsFood + totalCatsFood + totalTurtlesFood;

        if (totalFood <= leftFood) {
            double food = Math.ceil(totalFood - leftFood);
            System.out.printf("%.0f kilos of food left.", Math.abs(food));
        } else {
            double food = Math.floor(leftFood - totalFood);
            System.out.printf("%.0f more kilos of food are needed.", Math.abs(food));
        }


    }
}
