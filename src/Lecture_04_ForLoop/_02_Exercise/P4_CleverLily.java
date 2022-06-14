package Lecture_04_ForLoop._02_Exercise;

import java.util.Scanner;

public class P4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceForLaundry = Double.parseDouble(scanner.nextLine());
        int priceForToy = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        int money = 10;
        int toysCount = 0;

        for (int i = 1; i <= age; i ++) {
            if (i % 2 == 0) {
                sum += money;
                money += 10;
                sum -= 1;
            } else {
                toysCount ++;
            }
        }
        sum += toysCount * priceForToy;

        if (sum >= priceForLaundry) {
            System.out.printf("Yes! %.2f", sum - priceForLaundry);
        } else {
            System.out.printf("No! %.2f", priceForLaundry - sum);
        }
    }
}
