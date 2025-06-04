package l5_2;

abstract class AbstractAccount implements Account {
    protected int balance;

    public AbstractAccount(int balance) {
        this.balance = balance;
    }
}
