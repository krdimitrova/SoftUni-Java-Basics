package Lecture_05_WhileLoop._01_Lab;

import java.util.Scanner;

public class P1_ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while ( !text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();
        }
    }

}
