public class HomeTask08 {
    public static void main(String[] args) {
        double start = 0.1;
        double step = 0.1;
        double res;

        for (double i = start; i <= 10; i+=step){
            res = mathFunc(i);
            if (res < 0){
                break;
            }
            System.out.println(i + " - " + res);
        }
    }
    public static double mathFunc(double x){
        return Math.pow(x, 2) - Math.pow(Math.E, 2 * x) + 4;
    }
}
