package Lessons.webinar1;

import java.util.Random;

public class Ex {
    public static void main(String[] args) {
        st();
    }
        static void st() {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                Random i = new Random();
                item = i.nextInt(1, 90);
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
    }
}

