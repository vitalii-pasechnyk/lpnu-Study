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
        String toBin = Integer.toBinaryString(n);
        System.out.println("Результат: " + toBin);
    }
}