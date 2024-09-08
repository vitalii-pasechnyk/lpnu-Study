package Lab1;

import java.util.Scanner;

public class Task6 {

    // USD to any Currency
    public static final double USDtoUAH = 41.32;
    public static final double USDtoEUR = 0.90;
    public static final double USDtoCAD = 1.36;

    // EUR to any Currency
    public static final double EURtoUAH = 45.86;
    public static final double EURtoUSD = 1.11;
    public static final double EURtoCAD = 1.51;

    // CAD to any Currency
    public static final double CADtoUAH = 30.70;
    public static final double CADtoUSD = 0.74;
    public static final double CADtoEUR = 0.66;

    // UAH to any Currency
    public static final double UAHtoUSD = 1 / USDtoUAH;
    public static final double UAHtoEUR = 1 / EURtoUAH;
    public static final double UAHtoCAD = 1 / CADtoUAH;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Програма-конвертер валют для гривні, американського долара,\nканадського долара, євро.");
        System.out.print("Введіть суму та валюту для конвертації (наприклад, 100 UAH into USD): ");
        String AmountOfCurrency = sc.nextLine();

        String[] parts = AmountOfCurrency.split(" ");
        double amount = Double.parseDouble(parts[0]);
        String fromCurrency = parts[1].toUpperCase();
        String toCurrency = parts[3].toUpperCase();

        double calc = 0;
        switch (fromCurrency) {
            case "UAH":
                switch (toCurrency) {
                    case "USD":
                        calc = amount * UAHtoUSD;
                        break;
                    case "EUR":
                        calc = amount * UAHtoEUR;
                        break;
                    case "CAD":
                        calc = amount * UAHtoCAD;
                        break;
                    default:
                        System.out.println("Мені невідома така валюта для конвертації. Спробуй ще раз.");
                }
                break;
            case "USD":
                switch (toCurrency) {
                    case "UAH":
                        calc = amount * USDtoUAH;
                        break;
                    case "EUR":
                        calc = amount * USDtoEUR;
                        break;
                    case "CAD":
                        calc = amount * USDtoCAD;
                        break;
                    default:
                        System.out.println("Мені невідома така валюта для конвертації. Спробуй ще раз.");
                }
            case "EUR":
                switch (toCurrency) {
                    case "UAH":
                        calc = amount * EURtoUAH;
                        break;
                    case "USD":
                        calc = amount * EURtoUSD;
                        break;
                    case "CAD":
                        calc = amount * EURtoCAD;
                        break;
                    default:
                        System.out.println("Мені невідома така валюта для конвертації. Спробуй ще раз.");
                }
            case "CAD":
                switch (toCurrency) {
                    case "UAH":
                        calc = amount * CADtoUAH;
                        break;
                    case "USD":
                        calc = amount * CADtoUSD;
                        break;
                    case "EUR":
                        calc = amount * CADtoEUR;
                        break;
                    default:
                        System.out.println("Мені невідома така валюта для конвертації. Спробуй ще раз.");
                }
        }
        System.out.println(amount + " " + fromCurrency + " = " + calc + " " + toCurrency);
    }
}
