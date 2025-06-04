import java.util.Scanner;

public class Main2_2 {
    public static void main(String[] args) {

        String[] list = {"Молоко", "Хлеб", "Сыр", "Бананы"};
        double[] price = {98, 64.99, 125, 102.50};
        int[] countProducts = new int[list.length];
        double basketPrice = 0;

        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + " " + list[i] + " - по цене: " + price[i] + " руб/шт");
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите из списка номер продукта и количество");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] basketArr = input.split(" ");
            int what = Integer.parseInt(basketArr[0]) - 1;
            int count = Integer.parseInt(basketArr[1]);

            basketPrice += price[what] * count;
            countProducts[what] += count;
        }
        System.out.println("Ваша корзина: ");
        for (int i = 0; i < list.length; i++) {
            double sum = countProducts[i] * price[i];
            System.out.println(list[i] + " " + countProducts[i] + " шт " + price[i] + " руб/шт " + sum + " руб");

        }
        System.out.println("Общая сумма: " + basketPrice);
    }

}