package MoreExercises._03_WhileLoop;

public class P4_NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {

        int num = 3;

        for (int i = 1; num <= 100; i ++) {

            if (num % 3 == 0) {
                System.out.println(num);
            }
            num ++;
        }
    }
}
