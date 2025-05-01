import java.util.Scanner;
public class Main2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию: 1-сравнить, 2-округлить, 3-отбросить дроб.часть");
        int t = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите тип double ");
        double Num1 = scanner.nextDouble();
        switch (t) {
            case 1:
                System.out.println("Введите тип float ");
                float Num2 = scanner.nextFloat();
                Comparison(Num1,Num2);
                break;
            case 2:
                Round(Num1);
                break;
            case 3:
                Whole(Num1);
                break;
        }
    }
    public static void Comparison(double num_1, float num_2){
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
    public static void Round(double num_3){
        double NewNum=(long)(num_3+0.5);
        System.out.println("Округленное число :" + (long)NewNum);
    }
    public static void Whole(double num_4){
        double NewNum=(long)(num_4);
        System.out.println("Целая часть числа :" + NewNum);
    }
}