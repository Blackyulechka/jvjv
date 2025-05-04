package l5_2;

public class SavingsAccount extends AbstractAccount {
    public SavingsAccount(int balance){
        super(balance);
    }
    @Override
    public void pay(int amount){
        System.out.println("Нельзя оплатить со сберегательно счета!");
    }
    @Override
    public void addMoney(int amount){
        Balance+=amount;
        System.out.println("Баланс после пополнения: " + Balance);
    }
    @Override
    public void transfer(Account account, int amount){
        if (amount<=Balance) {
            account.addMoney(amount);
            Balance -=amount;
            System.out.println("Баланс после перевода: " + Balance);
        }
        else{
            System.out.println("Недостаточно средств!");
        }
    }

}
