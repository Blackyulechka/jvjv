abstract class Human {
    String name;
    String Passport;
    public Human(String name, String Passport) {
        this.name = name;
        this.Passport = Passport;
    }
    public abstract double GetSum(double Sum, Human type_Human);
    public abstract boolean isTaxable();
    @Override
    public String toString() {
        return name + " (" + Passport + ")";
    }
}
class Phys extends Human {
    public Phys(String name, String Passport) {
        super(name, Passport);
    }
    @Override
    public double GetSum(double Sum, Human type_Human) {
        return type_Human.isTaxable() ? Sum * 0.15:0 ;
    }//type_Human.isTaxable для физ. лица покажет true значит налог.проц. от физ к физ равен 15%
    //чередуются
    @Override
    public boolean isTaxable() {
        return false;
    }
}

class Yur extends Human {
    private double NDS;

    public Yur(String name, String Passport, double NDS) {
        super(name, Passport);
        this.NDS = NDS;
    }

    @Override
    public double GetSum(double Sum, Human type_Human) {
        return type_Human.isTaxable() ? Sum * NDS: Sum * 0.13;
    }//type_Human.isTaxable для юр. лица покажет true значит налог. проц. от юр к юр равен NDS

    @Override
    public boolean isTaxable() {
        return true;
    }
}

public class Main4 {
    public static void print_result(Human one, Human two, double Sum) {
        double Total_Sum = one.GetSum(Sum, two);
        System.out.println("Сумма которую заплатит " +one + " -> " + two + " : "+ Total_Sum);
    }

    public static void main(String[] args) {
        double Sum1 = 50000.0;
        Phys Julia = new Phys("Юлия", "12345");
        Phys Sasha = new Phys("Саша", "482341");
        Yur bank = new Yur("Тинькофф", "637623.09032", 0.033);
        Yur company = new Yur("Компания", "375423.2094", 0.045);

        print_result(Julia, bank, Sum1); // физ-> юр 15% 7500
        print_result(bank, Julia, Sum1); //юр -> физ 13% 6500
        print_result(bank, company, Sum1); //юр -> юр 0.33% 1650
        print_result(Julia, Sasha, Sum1); //физ -> физ 0% 0
    }
}