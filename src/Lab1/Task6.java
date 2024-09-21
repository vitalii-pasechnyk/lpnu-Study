/*
 Створити конвертер валют для: гривня, американський долар, канадський
 долар, євро. Введення даних у програму відбувається у вигляді “100 UAH
 into USD”, або в іншому зручному форматі.
 */

package Lab1;

import java.util.Scanner;

public class Task6 {

    public static final double USDtoUAH = 41.32;
    public static final double USDtoEUR = 0.90;
    public static final double USDtoCAD = 1.36;
    public static final double EURtoUAH = 45.86;
    public static final double EURtoUSD = 1.11;
    public static final double EURtoCAD = 1.51;
    public static final double CADtoUAH = 30.70;
    public static final double CADtoUSD = 0.74;
    public static final double CADtoEUR = 0.66;
    public static final double UAHtoUSD = 1.0 / USDtoUAH;
    public static final double UAHtoEUR = 1.0 / EURtoUAH;
    public static final double UAHtoCAD = 1.0 / CADtoUAH;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть суму та валюту для конвертації (наприклад, 100 UAH into USD): ");
        String input = sc.nextLine();

        String[] parts = input.split(" ");
        double amount = Double.parseDouble(parts[0]);
        String fromCurrency = parts[1].toUpperCase();
        String toCurrency = parts[3].toUpperCase();

        double result = -1; // Значення за замовчуванням
        switch (fromCurrency) {
            case "UAH":
                switch (toCurrency) {
                    case "USD":
                        result = amount / USDtoUAH;
                        break;
                    case "EUR":
                        result = amount / EURtoUAH;
                        break;
                    case "CAD":
                        result = amount / CADtoUAH;
                        break;
                }
                break;
            case "USD":
                switch (toCurrency) {
                    case "UAH":
                        result = amount * USDtoUAH;
                        break;
                    case "EUR":
                        result = amount * USDtoEUR;
                        break;
                    case "CAD":
                        result = amount * USDtoCAD;
                        break;
                }
                break;
            case "EUR":
                switch (toCurrency) {
                    case "UAH":
                        result = amount * EURtoUAH;
                        break;
                    case "USD":
                        result = amount * EURtoUSD;
                        break;
                    case "CAD":
                        result = amount * EURtoCAD;
                        break;
                }
                break;
            case "CAD":
                switch (toCurrency) {
                    case "UAH":
                        result = amount * CADtoUAH;
                        break;
                    case "USD":
                        result = amount * CADtoUSD;
                        break;
                    case "EUR":
                        result = amount * CADtoEUR;
                        break;
                }
                break;
        }

        if (result >= 0) {
            System.out.println(amount + " " + fromCurrency + " = " + result + " " + toCurrency);
        } else {
            System.out.println("Невідома валюта для конвертації. Спробуйте ще раз.");
        }
    }
}
