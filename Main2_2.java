import java.util.Scanner;
public class Main2_2 {
    public static void main(String[] args) {

        String[] list = {"Молоко", "Хлеб","Сыр","Бананы"};
        double[] price= {98,64.99,125,102.50};
        int[] CountProd= new int[list.length];
        double BasketPrice=0;

        for (int i=0; i<list.length;i++){
            System.out.println((i+1)+" "+list[i]+" - по цене: "+ price[i] + " руб/шт");
        }
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите из списка номер продукта и количество");
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            String[] BasketArr = input.split(" ");
            int what_i =Integer.parseInt(BasketArr[0])-1; //индекс продукта
            int count =Integer.parseInt(BasketArr[1]); //сколько продукта

            BasketPrice += price[what_i]*count; // общая стоимость корзины
            CountProd[what_i]+=count;
        }
        System.out.println("Ваша корзина: ");
        for (int i=0; i<list.length;i++) {
            double sum =CountProd[i]*price[i];
            System.out.println(list[i] + " " + CountProd[i] + " шт "+ price[i] + " руб/шт " + sum + " руб");

        }
        System.out.println("Общая сумма: " + BasketPrice);
    }

}