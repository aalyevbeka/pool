import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < testCase; i++) {
            String[] input = scanner.nextLine().split(" ");
            String s1 = input[0];
            String s2 = input[1];
            System.out.println(mix(s1, s2));
        }

    }

    public static String mix(String firstString, String secondString) {
         int a = firstString.length();
         int j = secondString.length();
         int min = Math.min(a, j);
         StringBuilder sb = new StringBuilder();
        for(int i = 0; i < min; i++) {
            sb.append(firstString.charAt(i));
            sb.append(secondString.charAt(i));
        }
        if (a > j) {
            sb.append(firstString, a, j);
        } else if (a < j) {
            sb.append(secondString, a, j);
        }
        return sb.toString();
    }
}
