
public class HomeTask05 {
    public static void main(String[] args) {
        double n = 10;
        double a = 1;
        double x1 = -2 * a;
        double dx = a / 5;

        for (double x = x1; x <= n; x+=dx){
            if (x <= 0){
                System.out.println("Для X = " + x + " значение функции Y = " + funcOne(x, a));
            } else {
                System.out.println("Для X = " + x + " значение функции Y = " + funcTwo(x, a));
            }
        }

    }
    public static double funcOne(double x, double a){
        return (a / 2) * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a));
    }
    public static double funcTwo(double x, double a){
        return (4 * Math.pow(a, 3)) / (Math.pow(x, 2) + (4 * Math.pow(a, 2)));
    }
}
