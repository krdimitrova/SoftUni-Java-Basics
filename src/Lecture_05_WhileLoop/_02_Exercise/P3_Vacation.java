package Lecture_05_WhileLoop._02_Exercise;

import java.util.Scanner;

public class P3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int days = 0;
        int spending = 0;


        while (currentMoney < neededMoney && spending < 5) {
            String input = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days++;

            if (input.equals("spend")) {
                currentMoney -= money;
                spending += 1;
                if (currentMoney < 0) {
                    currentMoney = 0;
                }
            } else if (input.equals("save")) {
                currentMoney += money;
                spending = 0;
            }

        }
        if (spending == 5) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        }
        if (currentMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
