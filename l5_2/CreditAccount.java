public class CreditAccount extends AbstractAccount{
    public CreditAccount(int balance){
        super(balance);
    }
    @Override
    public void pay(int amount){
        balance-=amount;
        System.out.println("Баланс после оплаты : " + balance);
    }
    @Override
    public void addMoney(int amount){
        balance+=amount;
        System.out.println("Баланс после пополнения: " + balance);
    }
    @Override
    public void transfer(Account account, int amount){
            account.addMoney(amount);
            balance -= amount;
            System.out.println("Баланс после перевода: " + balance);
        }
}

