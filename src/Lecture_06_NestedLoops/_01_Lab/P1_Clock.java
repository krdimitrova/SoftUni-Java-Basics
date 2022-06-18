package Lecture_06_NestedLoops._01_Lab;

public class P1_Clock {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {
            int min;
            for (min = 0; min <= 59; min++) {
                System.out.println(hour + ":" + min);
            }
        }
    }
}
