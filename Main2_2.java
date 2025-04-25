import java.util.Scanner;
public class Main2_2 {
    public static void main(String[] args) {

        String[] list = {"Молоко", "Хлеб","Сыр","Бананы"};
        double[] price= {98,64.99,125,102.50};
        int[] count_prod= new int[list.length];
        double basket_price=0;

        for (int i=0; i<list.length;i++){
            System.out.println((i+1)+" "+list[i]+" - по цене: "+price[i]+" руб/шт");
        }
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите из списка номер продукта и количество");
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            String[] basket_arr = input.split(" ");
            int what_i =Integer.parseInt(basket_arr[0])-1; //индекс продукта
            int count =Integer.parseInt(basket_arr[1]); //сколько продукта

            basket_price = basket_price+ price[what_i]*count; // общая стоимость корзины
            count_prod[what_i]+=count;
        }
        System.out.println("Ваша корзина: ");
        for (int i=0; i<list.length;i++) {
            double sum =count_prod[i]*price[i];
            System.out.println(list[i]+ " "+ count_prod[i]+" шт "+ price[i]+ " руб/шт "+sum + " руб");

        }
        System.out.println("Общая сумма: "+ basket_price);
    }

}