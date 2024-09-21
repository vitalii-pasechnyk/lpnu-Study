/*
    Перетворення заданого цілого числа у двійкову систему.
 */

package Lab1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Програма для перетворення заданого цілого числа у двійкову систему.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int n = sc.nextInt();
        System.out.println("Результат: ");
        toBinary(n);
    }

    public static void toBinary(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }

        System.out.println(binary.toString());
    }
}