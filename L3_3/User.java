package L3_3;
public class User {
        public String Name;
        public String Surname;
        public String email;
        public int id;
        public static int totalOnline=0;
        public User(String Name,String Surname,String email,int id){
            this.Name=Name; this.Surname=Surname; this.email=email; this.id=id;
            totalOnline++;
        }
        public static int GetOnline(){
            return totalOnline;
        }
}

