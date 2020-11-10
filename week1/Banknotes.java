import java.util.Scanner;
//lamb
public class Banknotes {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int money = c.nextInt();
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        System.out.println(money);
        for (int i = 0; i < banknotes.length; i++) {
            if (money >= banknotes[i] && money > 0) {
                int couter = money / banknotes[i];
                System.out.println(couter+ " nota(s) de R$ "+ banknotes[i]);
                money = money % banknotes[i];
            } else {
                System.out.println(0 + " nota(s) de R$ " + banknotes[i]);
            }
        }

    }
}






