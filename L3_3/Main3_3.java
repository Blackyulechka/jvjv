package L3_3;
import java.util.Scanner;
public class Main3_3 {
    public static void main(String[] args) {
        User User1 = new User("Yulechka", "Black","YouBl@mail.ru",123321);
        User User2 = new User("Antoshka", "Tishka","Malchik@gmail.com",909345);
        User User3 = new User("Tsukuiomi", "Dream","tsuku@mail.ru",133748);
        System.out.println("Сейчас онлайн: " + User.totalOnline +" юзеров");
    }
}