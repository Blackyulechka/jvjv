import java.util.Scanner;
public class Main2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: 1-сравнить, 2-округлить, 3-отбросить дроб.часть");
        int t = scanner.nextInt();
        scanner.nextLine();
        switch (t) {
            case 1:
                System.out.println("Введите тип double");
                double num_1 = scanner.nextDouble();
                System.out.println("Введите тип float");
                float num_2 = scanner.nextFloat();
                sravn(num_1,num_2);
                break;
            case 2:
                System.out.println("Введите тип double");
                double num_3 = scanner.nextDouble();
                okrug(num_3);
                break;
            case 3:
                System.out.println("Введите тип double");
                double num_4 = scanner.nextDouble();
                trash(num_4);
                break;
        }
    }
    public static void sravn(double num_1, float num_2){
        if (Math.abs(num_1-num_2)<0.000001){
            System.out.println("Числа равны");
        }
        else if (num_1 > num_2) {
            System.out.println("Число типа double больше");
        }
        else if (num_1 < num_2) {
            System.out.println("Число типа float больше");
        }
    }
    public static void okrug(double num_3){
        double new_num=(long)(num_3+0.5);
        System.out.println("Округленное число :" + (long)new_num);
    }
    public static void trash(double num_4){
        double new_num=(long)(num_4);
        System.out.println("Целая часть числа :" + new_num);
    }
}