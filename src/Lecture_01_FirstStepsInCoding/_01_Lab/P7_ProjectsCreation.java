package Lecture_01_FirstStepsInCoding._01_Lab;

import java.util.Scanner;

public class P7_ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        int totalTime = projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalTime, projects);
    }
}
