package Lecture_06_NestedLoops._01_Lab;

import java.util.Scanner;

public class P3_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int combinations = 0;

        for (int i = 0; i <= n; i ++) {
            for (int i2 = 0; i2 <= n; i2 ++){
                for (int i3 = 0; i3 <= n; i3++) {
                    if (i + i2 + i3 == n){
                        combinations ++;
                    }
                }
            }
        }
        System.out.println(combinations);
    }
}
