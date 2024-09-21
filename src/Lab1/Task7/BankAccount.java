package Lab1.Task7;

public class BankAccount {
    private String name;
    private Bank bank;
    private double balance;

    public BankAccount(String name, Bank bank, double balance) {
        this.name = name;
        this.bank = bank;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public String getCurrency() {
        return bank.getCurrency();
    }
    public void transfer(BankAccount target, double amount) {
        double fee = 0;

        if (this.bank == target.bank) {
            fee = this.name.equals(target.name) ? 0 : 0.03;
        } else {
            fee = this.name.equals(target.name) ? 0.02 : 0.06;
        }

        double totalAmount = amount * (1 + fee);
        if (balance < totalAmount) throw new IllegalArgumentException("Недостатньо коштів!");

        double convertedAmount = bank.convert(amount, bank.getCurrency());
        balance -= totalAmount;
        target.balance += convertedAmount;

        System.out.println("Переказ: " + convertedAmount + " " + target.bank.getCurrency());
    }
}
