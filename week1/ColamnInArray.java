import java.util.Scanner;

public class ColamnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double array[][] = new double[12][12];
        int colamn = scanner.nextInt();
        String s = scanner.next();
        double sum = 0;
        if (colamn >= 0 && colamn <= 11) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = scanner.nextDouble();
                    if (colamn == j) {
                        sum += array[i][j];
                    }
                }
            }
            if ("S".equals(s)) {
                System.out.printf("%.1f\n", sum);
            } else if ("M".equals(s)) {
                System.out.printf("%.1f\n", (sum / 12));
            }
        }
    }
}