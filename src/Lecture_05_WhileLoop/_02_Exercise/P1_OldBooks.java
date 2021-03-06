package Lecture_05_WhileLoop._02_Exercise;

import java.util.Scanner;

public class P1_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        boolean isFound = false;
        int bookCount = 0;

        while (!currentBook.equals("No More Books")) {
            if (searchedBook.equals(currentBook)) {
                isFound = true;
                break;
            }
            bookCount++;
            currentBook = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.printf("The book you search is not here! %n" +
                    "You checked %d books.", bookCount);
        }
    }
}
