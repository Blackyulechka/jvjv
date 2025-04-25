import java.util.Scanner;
class User{
    String Name;
    String Surname;
    String email;
    int id;
    public static int totalOnline=0;
    public User(String Name,String Surname,String email,int id){
        this.Name=Name; this.Surname=Surname; this.email=email; this.id=id;
        totalOnline++;
    }
    public static int GetOnline(){
        return totalOnline;
    }
}

public class Main {
    public static void main(String[] args) {
        User User1 = new User ("Yulechka", "Black","YouBl@mail.ru",123321);
        User User2 = new User ("Antoshka", "Tishka","Malchik@gmail.com",909345);
        User User3 = new User ("Tsukuiomi", "Dream","tsuku@mail.ru",133748);
        System.out.println("Сейчас онлайн: " + User.totalOnline +" юзеров")
    }
    }