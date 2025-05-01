import java.util.Date;
import static java.lang.Math.PI;
public class Main1_2 {
    public static void main(String[] args) {
        double OneArea = Method(4, 24.0);
        System.out.println(OneArea);
    }
    public static double Method(int Count, double D){
        double r = D/2;
        double TotalArea=Math.PI*Math.pow(r,2);
        double OneArea=TotalArea/Count;
        return OneArea;
    }
}