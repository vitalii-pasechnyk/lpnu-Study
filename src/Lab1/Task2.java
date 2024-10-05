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
        System.out.println("Наприклад: 2 + 4 ...");
        System.out.print("Введіть простий вираз: ");
        String problem = input.nextLine();

        String[] split = problem.split(" ");
        double a = Double.parseDouble(split[0]);
        String d = split[1];
        double b = Double.parseDouble(split[2]);

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
