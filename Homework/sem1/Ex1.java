package Homework.sem1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner numU = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int num = numU.nextInt();

        System.out.println("\nЗадание №1.\n     Треугольное число: " + ex1(num)); // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        System.out.println("     Проверка: " + (int) (0.5 * num * (num + 1)));

        System.out.println("\nЗадание №2.\n     Факториал числа равен: " + ex2(num) +"\n"); //  Вычислить n! (произведение чисел от 1 до n)

        ex3();//Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

        ex4();//Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
    }

    static int ex1(int num) {
        int n = 0;
        for (int i = 0; i < num + 1; i++) {
            n += i;
        }
        return n;

    }

    static int ex2(int num) {
        int n = 1;
        for (int i = 1; i < num + 1; i++) {
            n *= i;
        }
        return n;
    }

    static void ex3() {
        System.out.print("Задание №3. \n      ");
        int count = 0, k = 0;
        for (int i = 1; i < 1000; i++) {
            count = 0;
            for (int j = 1; j < 1000; j++) {
                if (i % j == 0 ) {
                    count ++;
                }
            }
            if (count <= 2) {
                System.out.printf("%d, ", i);
            }
        }
    }
    static void ex4() {
        Scanner number1 = new Scanner(System.in);
        System.out.print("\n\nЗадание №4.\n       Введите первое число: ");
        int num1 = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        System.out.print("      Введите второе число: ");
        int num2 = number2.nextInt();
        Scanner choice = new Scanner(System.in);
        System.out.println("Выбирете необходимую операцию: \n1.Сложение \n2.Вычитание \n3.Умножение \n4.Деление \n5.Возведение в степень");
        int choice1 = choice.nextInt();
        switch (choice1){
            case 1: System.out.printf("Сумма чисел равна: " + (num1 + num2));
                break;
            case 2: System.out.printf("Разность чисел равна: " + (num1 - num2));
                break;
            case 3: System.out.printf("Прозведение чисел равно: " + (num1 * num2));
                break;
            case 4: System.out.printf("Разность чисел равна: " + (num1/num2));
                break;
            case 5: System.out.printf("Ответ: " + ((int)Math.pow(num1, num2)));
                break;
            default:
                System.out.println("Нет таких операций!");
        }

    }
}











//        * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например,
//        2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
//        Предложить хотя бы одно решение или сообщить, что его нет.

