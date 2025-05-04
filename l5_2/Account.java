package l5_2;

public interface Account {
    public void pay(int amount);
    public void transfer(Account account, int amount);
    public void addMoney(int amount);
}

