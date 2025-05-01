public class Main5_2 {
    public static void main(String[] args){
        AbstractAccount SavingAcc = new SavingsAccount(5000);
        AbstractAccount CreditAcc = new CreditAccount(6700);
        AbstractAccount CheckingAcc = new CheckingAccount(4200);
        System.out.println(" ");

        SavingAcc.pay(3200);
        SavingAcc.addMoney(500);
        SavingAcc.transfer(CreditAcc,4500);
        System.out.println(" ");

        CreditAcc.pay(250);
        CreditAcc.addMoney(500);
        CreditAcc.transfer(CheckingAcc,4500);
        System.out.println(" ");

        CheckingAcc.pay(5200);
        CheckingAcc.addMoney(2500);
        CheckingAcc.transfer(SavingAcc,300);
    }
}
