package Lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Простий парсер виразів.");
        System.out.println("Наприклад: 2 + 4 ...");
        System.out.println("Введіть простий вираз:");
        String problem = input.nextLine();

        String[] split = problem.split(" ");
        double a = Double.parseDouble(split[0]);
        String d = split[1];
        double b = Double.parseDouble(split[2]);

        double result = 0;
        switch (d) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Некорректна дія.");
        }
        System.out.println(a + " " + d + " " + b +  " = " + result);
    }
}
