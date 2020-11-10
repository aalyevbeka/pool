import java.util.Scanner;
//lamb
public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        double money = c.nextDouble();
        int[] banknotes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.50, 0.25, 0.10, 0.05,0.01};
        System.out.println("NOTAS:");
        for (int i = 0; i < banknotes.length; i++) {
            if (money >= banknotes[i] && money > 0) {
                double couter = money / banknotes[i];
                System.out.println(Math.floor(couter)+ " nota(s) de R$ "+ banknotes[i]);
                money = money % banknotes[i];
            } else {
                System.out.println(0 + " nota(s) de R$ " + banknotes[i]);
            }
        }
        System.out.println("MOEDAS");
        for (int j = 0; j < coins.length; j++){
            if (money >= coins[j] && money > 0){
                double coinCount = money / coins[j];
                System.out.println(Math.floor(coinCount) +" moeda(s) de R$ " +coins[j]);
                money = money % coins[j];
            }else {
                System.out.println(0 + " moeda(s) de R$ " + coins[j]);
            }
        }

    }
}
