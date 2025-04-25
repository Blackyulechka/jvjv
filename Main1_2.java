import java.util.Date;
import static java.lang.Math.PI;
public class Main1_2 {
    public static void main(String[] args) {
        double one_area = method(4, 24.0);
        System.out.println(one_area);
    }
    public static double method(int Count, double D){
        double r = D/2;
        double total_area=Math.PI*Math.pow(r,2);
        double one_area=total_area/Count;
        return one_area;
    }
}