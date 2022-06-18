package Lecture_06_NestedLoops._01_Lab;

public class P2_MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= 10; n++) {
                System.out.printf("%d * %d = %d%n", i, n, i * n);
            }
        }
    }
}
