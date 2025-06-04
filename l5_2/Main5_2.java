package l5_2;

public class Main5_2 {
    public static void main(String[] args) {
        AbstractAccount savingAcc = new SavingsAccount(5000);
        AbstractAccount creditAcc = new CreditAccount(6700);
        AbstractAccount checkingAcc = new CheckingAccount(4200);
        System.out.println(" ");

        savingAcc.pay(3200);
        savingAcc.addMoney(500);
        savingAcc.transfer(creditAcc, 4500);
        System.out.println(" ");

        creditAcc.pay(250);
        creditAcc.addMoney(500);
        creditAcc.transfer(checkingAcc, 4500);
        System.out.println(" ");

        checkingAcc.pay(5200);
        checkingAcc.addMoney(2500);
        checkingAcc.transfer(savingAcc, 300);
    }
}
