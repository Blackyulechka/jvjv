public class Main1_2 {
    public static void main(String[] args) {
        double area = Method(4, 24.0);
        System.out.println(area);
    }

    public static double Method(int Count, double D) {
        double r = D / 2;
        double totalArea = Math.PI * Math.pow(r, 2);
        return totalArea / Count;
    }
}