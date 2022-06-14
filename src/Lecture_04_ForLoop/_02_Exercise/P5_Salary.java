package Lecture_04_ForLoop._02_Exercise;

import java.util.Scanner;

public class P5_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < tabs ; i ++){
            String tabStuff = scanner.nextLine();
            switch(tabStuff){
                case "Instagram":
                    salary -= 100;
                    break;
                case "Facebook":
                    salary-= 150;
                    break;
                case "Reddit":
                    salary-= 50;
                    break;
            }
            if (salary <= 0){
                break;
            }
        }

        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
