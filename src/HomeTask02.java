public class HomeTask02 {
    public static void main(String[] args) {
        int n = 10;
        float a = 0.50f;
        float b = 1.00f;
        int count = 1;
        float res = 0;

        float step = (b - a) / (n - 1);
        System.out.println("------------------------------------");
        System.out.printf("|%-10s |%-10s |%-10s|\n", "№", "a", "Результат");
        System.out.println("------------------------------------");
        for (int i = 1; i <= n; i++){
            res = HomeTask01.roundDouble(HomeTask01.mathFunction(a), 6);
            System.out.printf("|%-10s |%-10s |%-10s|\n", i, HomeTask01.roundDouble(a,2), res);
            a += step;
        }
        System.out.println("------------------------------------");
    }
}
