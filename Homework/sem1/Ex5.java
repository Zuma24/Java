package Homework.sem1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        ex4();//Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
    }
    static void ex4() {
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        System.out.println(num);
    }
}
