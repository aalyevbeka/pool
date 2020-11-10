import java.util.Scanner;
//lamb
public class GameTimewithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int startHora = Integer.parseInt(str[0]);
        int startMinuto = Integer.parseInt(str[1]);
        int endHora = Integer.parseInt(str[2]) ;
        int endMinuto = Integer.parseInt(str[3]);
        int resultHora = endHora - startHora;
        int resultMinuto = endMinuto - startMinuto;
        if (resultHora == 0 && resultMinuto == 0){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        if (resultMinuto < 0) {
            resultHora -= 1;
            resultMinuto += 60;
        }
        if (resultHora < 0) {
            resultHora += 24;
        }
        if (resultMinuto != 0 || resultMinuto != 0)
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S", resultHora, resultMinuto);
    }

}
