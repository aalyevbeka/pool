import java.util.Arrays;
import java.util.Scanner;
//lamb
public class TriangleTypes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] str = s.nextLine().split(" ");
        double[] arr = new double[str.length];
        for (int i = 0; i < str.length; ++i){
            arr[i] = Double.valueOf(str[i]);
        }
        Arrays.sort(arr);
        double c = arr[0];
        double b = arr[1];
        double a = arr[2];
       if (a >= b + c)
           System.out.println("NAO FORMA TRIANGULO");

       if ((a*a) == ((b * b) + (c * c)) )
           System.out.println("TRIANGULO RETANGULO");

        if ((a * a) > (b * b) + (c * c))
            System.out.println("TRIANGULO OBTUSANGULO");

        if ((a * a) < (b * b) + (c * c ))
            System.out.println("TRIANGULO ACUTANGULO");

        if (a == b && a == c )
            System.out.println("TRIANGULO EQUILATERO");

        if ((a == c) && (a != b) || (b == a )&& (b != c) || (c == b) && (c != a))
        System.out.println("TRIANGULO ISOSCELES");
    }
}

