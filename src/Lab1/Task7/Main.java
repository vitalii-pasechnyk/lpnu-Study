package Lab1.Task7;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("MonoBank", "USD", 41.65);
        Bank b2 = new Bank("PrivatBank", "EUR", 46.73);
        Bank b3 = new Bank("KredoBank", "PLN", 10.99);

        BankAccount u1 = new BankAccount("Vitalii", b1, 1060.98);
        BankAccount u2 = new BankAccount("Artem", b2, 999999.59);
        BankAccount u3 = new BankAccount("Oleh", b3, 100000.0);
        BankAccount u4 = new BankAccount("Artem", b1, 500000.60);

        u1.transfer(u2, 500);

        u2.transfer(u1, 1000);

        u1.transfer(u4, 100);

        u3.transfer(u1, 500);

        System.out.println("Vitalii's balance: " + u1.getBalance() + " " + u1.getCurrency());
        System.out.println("Artem's balance: " + u2.getBalance() + " " + u2.getCurrency());
        System.out.println("Oleh's balance: " + u3.getBalance() + " " + u3.getCurrency());
        System.out.println("Artem's balance: " + u4.getBalance() + " " + u4.getCurrency());
    }
}
