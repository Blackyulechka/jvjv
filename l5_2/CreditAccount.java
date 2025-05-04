package l5_2;

public class CreditAccount extends AbstractAccount{
    public CreditAccount(int Balance){
        super(Balance);
    }
    @Override
    public void pay(int amount){
        Balance-=amount;
        System.out.println("Баланс после оплаты : " + Balance);
    }
    @Override
    public void addMoney(int amount){
        Balance+=amount;
        System.out.println("Баланс после пополнения: " + Balance);
    }
    @Override
    public void transfer(Account account, int amount){
            account.addMoney(amount);
            Balance -= amount;
            System.out.println("Баланс после перевода: " + Balance);
        }
}

