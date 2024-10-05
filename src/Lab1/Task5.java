package Lab1;

public class Task5 {
    public static void main(String[] args) {
        String[][] matrix = {
                {"iphone", "xiaomi", "samsung", "htc"},
                {"xiaomi", "poco", "oppo", "nokia"},
                {"pixel", "redmi", "xiaomi", "microsoft"},
                {"xiaomi", "nokia", "htc", "microsoft"}
        };

        String substring = "nokia";

        int count = countSubstringInMatrix(matrix, substring);
        System.out.println("Number of occurrences of " + substring + ": " + count);
    }

    public static int countSubstringInMatrix(String[][] matrix, String substring) {
        int count = 0;

        for (String[] row : matrix) {
            for (String element : row) {
                if (element.contains(substring)) {
                    count++;
                }
            }
        }

        return count;
    }
}
