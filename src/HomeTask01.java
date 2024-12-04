public class HomeTask01 {
    public static void main(String[] args) {
        double x = 0.5;
        double res = 0;

        res = mathFunction(x);

        System.out.println("Проверка, при x = " + x + " результат " + roundDouble(res, 5));
    }
    public static double mathFunction(double x){
        return  Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2d / 3d))) + 1.7;
    }
    public static double roundDouble(double x, int y){
        return Math.round( x * Math.pow(10, y)) / Math.pow(10, y);
    }
    public static float mathFunction(float x){
        double res = 0;
        res = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2d / 3d))) + 1.7;
        return (float) res;
    }
    public static float roundDouble(float x, int y){
        double res = 0;
        res = Math.round( x * Math.pow(10, y)) / Math.pow(10, y);
        return (float) res;
    }
}
