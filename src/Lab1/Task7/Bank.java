package Lab1.Task7;

public class Bank {
    private String name;
    private String currency;
    private double RateToUAH;

    public Bank(String name, String currency, double RateToUAH) {
        this.name = name;
        this.currency = currency;
        this.RateToUAH = RateToUAH;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public double convert(double amount, String fromCurrency) {
        if (fromCurrency.equals(currency)) {
            return amount;
        } else if (fromCurrency.equals("UAH")) {
            return amount / RateToUAH;
        }
        return amount * RateToUAH;
    }
}
