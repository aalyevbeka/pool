import java.util.Scanner;
public class PerfectNumber {
    static int perfectNumber(int number){
        int summ =0;
        for(int i = 1; i < number; i++) {
            if (number % i == 0){
                summ = summ + i;
            }
        }
        return summ;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        for (int a = 0; a < count; a++ ) {
            int number = s.nextInt();
            if (perfectNumber(number) == number) {
                System.out.printf("%d eh perfeito \n", number);
            } else {
                System.out.printf("%d nao eh perfeito \n", number);
            }
        }
    }
}
