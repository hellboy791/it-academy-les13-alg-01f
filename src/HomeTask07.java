public class HomeTask07 {
    public static void main(String[] args) {
        int n = 10;
        int m = 9;
        double x = 4;
        double z = 4;
        double hx = 1 / 5d;
        double hz = 1 / 4d;

        System.out.println("Таблица для x");
        outTable(x, n, hx, z);
        System.out.println("Таблица для z");
        outTable(z, m, hz, x);
    }
    public static double mathFunction(double x, double z){
        return Math.sqrt(Math.pow(z, 2) + Math.pow(x, 2)) * Math.log10(z) + (Math.abs(Math.log10(z)) / Math.sqrt(Math.pow(x, 2) - Math.pow(z, 2) + 3.2));
    }
    public static void outTable(double startValue, double endValue, double step,  double z){
        double res;

        for (double i = startValue; i <= endValue; i+= step){
            res = mathFunction(i, z);
            System.out.printf("%.2f\t%.4f\n",i, res);
        }
    }
}
