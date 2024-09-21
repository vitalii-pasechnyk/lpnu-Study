package Lab1;

public class Task5 {
    public static void main(String[] args) {
        String[][] martix = {
                {"iphone", "xiaomi", "samsung"},
                {"xiaomi", "poco", "oppo"},
                {"pixel", "redmi", "xiaomi"}
        };

        String ss = "xiaomi";

        int count = countSubstringInMatrix(martix, ss);
        System.out.println("Number of Substring " + ss + ": " + count );
    }
    public static int countSubstringInMatrix(String[][] matrix, String substring) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].contains(substring)) {
                    count++;
                }
            }
        }

        return count;
    }

}
