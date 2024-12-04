
public class HomeTask03 {
    public static void main(String[] args) {
        double x = 0.5;
        double n = 20;
        double sum = 0;
        double res;

        for (double k = 1; k <= n; k++){
            sum += mathFunc(k, x);
        }
        res = Math.sqrt(n * Math.PI) * sum;
        System.out.printf("Результат этой длинной и странной функции равен " + res);
    }
    public static double mathFunc(double k, double x){
        return (Math.sin((k * x) / 2) + Math.sin(((k * x) - 1)) / 2) / Math.pow(Math.E, x - (1 / k));
    }
}
