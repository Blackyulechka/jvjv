import java.util.Date;
import static java.lang.Math.PI;
public class Main1_1 {
    public static void main(String[] args) {
        int num = 10;
        int n = 2;
        double res=kor(num,n);
        System.out.println(res);

    }
    public static double kor(int num,int n){
        double num0= num;
        double temp = num0;
        double eps = 0.000001;
        do {
            temp = num0;
            num0 = ( (n-1)*temp + num / (Math.pow(temp, (n - 1) )) )/ n;
        }while (Math.abs(num0 - temp) >= eps) ;

        return num0;}
}