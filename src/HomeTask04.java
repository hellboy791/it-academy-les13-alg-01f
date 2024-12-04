public class HomeTask04 {
    public static void main(String[] args) {
        double[][] pointsArray = {{1.1, -0.2, 0.1, -3, -8.1, -1.9},{0, 2, -2, -6, 1, 0.0001}};
        int col = 0;
        double x = 0;
        double y = 0;

        for (int i = 0; i < pointsArray[0].length; i++){
            x = pointsArray[0][i];
            y = pointsArray[1][i];

            if ((x <= 2 && x >= 0) && (y >= -1 && y <= 1) || ((x >= -2 && x <= 0) && (y <= 2 && y >=0))){
                col++;
            }
        }
        System.out.printf("Количество точек попавших в область истинности равно " + col);
    }
}
