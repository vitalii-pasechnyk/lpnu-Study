package Lab1.Task4;

public class CharCount {
    char symbol;
    int count;

    public CharCount(char symbol, int count) {
        this.symbol = symbol;
        this.count = count;
    }
    public char getSymbol() {
        return symbol;
    }
    public int getCount() {
        return count;
    }
    public void incrementCount() {
        count++;
    }
    public String toString() {
        return "Symbol: " + symbol + " Count: " + count + "\n";
    }
}
