package l5_2;

abstract class AbstractAccount implements Account {
    protected int Balance;
    public AbstractAccount(int Balance) {
        this.Balance = Balance;
    }
}
