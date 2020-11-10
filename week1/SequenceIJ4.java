import java.util.Scanner;

public class SequenceIJ4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double i = s.nextDouble();
        double j;
        int count = 0;
        for (int a = 0; a < 3;  a++){
            j = i+1;
            count++;
            System.out.print(i+" ");
            System.out.print(j + a);
            if (count==1){
                System.out.println();
                count = 0;
            }
        }
    }
}
