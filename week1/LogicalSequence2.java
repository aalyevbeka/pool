
import java.util.Scanner;

public class LogicalSequence2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int counter = 0;
        for(int i = 0; i < y; i++){
            System.out.print(i+1+" ");
            counter ++;
            if (counter==x){
                System.out.println();
                counter = 0;
            }
        }
        }