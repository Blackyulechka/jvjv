package l5_2;

public class CheckingAccount extends AbstractAccount {
    public CheckingAccount(int balance) {
        super(balance);
    }
    @Override
    public void pay(int amount) {
        if (Balance < amount) {
            System.out.println("Недостаточно средств на вашем балансе: " + Balance);
        }
        else {
            Balance -= amount;
            System.out.println("Баланс после оплаты : " + Balance);
        }
    }

    @Override
    public void addMoney(int amount) {
        Balance += amount;
        System.out.println("Баланс после пополнения: " + Balance);
    }

    @Override
    public void transfer(Account account, int amount) {
        if (amount <= Balance) {
            account.addMoney(amount);
            Balance -= amount;
            System.out.println("Баланс после перевода: " + Balance);
        } else {
            System.out.println("Недостаточно средств!");
        }
    }
}
