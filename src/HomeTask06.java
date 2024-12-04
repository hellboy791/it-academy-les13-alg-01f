public class HomeTask06 {
    public static void main(String[] args) {
        int col = 20;
        int count = 0;
        int res;

        for (int i = -30; i <= 60; i++){
            if (count == col){
                break;
            }
            res = func(i);
            if (isInInterval(res)){
                System.out.println(res);
                count++;
            }
        }
    }
    public static int func(int k){
        return (int) (Math.pow(k, 3) - (25 * Math.pow(k, 2)) + 50 * k + 1000);
    }
    public static boolean isInInterval(int k){
        int a = (int) (3 * Math.pow(10, 3));
        int b = (int) (6 * Math.pow(10, 4));
        int m = 4;
        return (k >= Math.sqrt(a + b + m) && k <= m * Math.sqrt(a + b)) || (k >= Math.sqrt(a * b * m) && k <= m * Math.sqrt(a * b));
    }
}
