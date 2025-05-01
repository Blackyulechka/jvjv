public class CheckingAccount extends AbstractAccount {
    public CheckingAccount(int balance) {
        super(balance);
    }
    @Override
    public void pay(int amount) {
        if (balance < amount) {
            System.out.println("Недостаточно средств на вашем балансе: " + balance);
        }
        else {
            balance -= amount;
            System.out.println("Баланс после оплаты : " + balance);
        }
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
