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
        } else {
            String binary = "";

            while (n > 0) {
                binary = (n % 2) + binary;
                n = n / 2;
            }

            System.out.println(binary);
        }
    }
}