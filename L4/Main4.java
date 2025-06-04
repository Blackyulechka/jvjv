package L4;

public class Main4 {
    public static void print_result(Human one, Human two, double Sum) {
        double totalSum = one.GetSum(Sum, two);
        System.out.println("Сумма которую заплатит " + one + " -> " + two + " : " + totalSum);
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