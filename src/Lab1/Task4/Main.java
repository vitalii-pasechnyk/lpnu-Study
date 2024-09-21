package Lab1.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.print("Input a string line: ");
        String input = SCANNER.nextLine();

        CharCount[] charCounts = new CharCount[0];

        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                continue;
            }
            boolean found = false;

            for (CharCount charCount : charCounts) {
                if (charCount.getSymbol() == ch) {
                    charCount.incrementCount();
                    found = true;
                    break;
                }
            }
            if (!found) {
                charCounts = Arrays.copyOf(charCounts, charCounts.length + 1);
                charCounts[charCounts.length - 1] = new CharCount(ch, 1);
            }
        }
        for (CharCount charCount : charCounts) {
            System.out.print(charCount.toStringM() + " ");
        }
    }
}
