package Lab1.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input a string line: ");
        String input = console.nextLine();

        CharCount[] charCounts = new CharCount[0];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                continue;
            }
            boolean found = false;

            for (int j = 0; j < charCounts.length; j++) {
                if (charCounts[j].getSymbol() == ch) {
                    charCounts[j].incrementCount();
                    found = true;
                    break;
                }
            }

            if (!found) {
                charCounts = Arrays.copyOf(charCounts, charCounts.length + 1);
                charCounts[charCounts.length - 1] = new CharCount(ch, 1);
            }
        }

        for (int i = 0; i < charCounts.length; i++) {
            System.out.print(charCounts[i] + " ");
        }
    }
}
