package l5_2;

public class SavingsAccount extends AbstractAccount {
    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Нельзя оплатить со сберегательно счета!");
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;
        System.out.println("Баланс после пополнения: " + balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount <= balance) {
            account.addMoney(amount);
            balance -= amount;
            System.out.println("Баланс после перевода: " + balance);
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

}
