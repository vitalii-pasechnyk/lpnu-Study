/*
Написати простий парсер виразів. Програма повинна вирішувати прості
вирази типу “2 + 4 = ?”, “2 + 4 = ”, “2 + 4”. Повинен підтримувати основні
операції (додавання, віднімання, множення, ділення). Необхідно обробити
виключні ситуації.
 */

package Lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Простий парсер виразів.");

        System.out.print("Введи перше число: ");
        double a = input.nextDouble();

        System.out.print("Введи друге число: ");
        double b = input.nextDouble();

        System.out.print("Введи дію, яку хочеш виконати між цими числами: ");
        String d = input.next();

        System.out.println("Ти ввів: " + a + " " + d + " " + b + "\n");

        double result;
        switch (d) {
            case "+":
                result = a + b;
                System.out.println(a + " " + d + " " + b +  " = " + result);
                break;
            case "-":
                result = a - b;
                System.out.println(a + " " + d + " " + b +  " = " + result);
                break;
            case "*":
                result = a * b;
                System.out.println(a + " " + d + " " + b +  " = " + result);
                break;
            case "/":
                result = a / b;
                System.out.println(a + " " + d + " " + b +  " = " + result);
                break;
            default:
                System.out.println("Некоректна дія.");
        }
    }
}
