import java.util.Scanner;
public class FibonacciArray {
            static long fib(int n) {
                long a = 0, b = 1, c;
                if (n == 0)
                    return a;
                for (int i = 2; i <= n; i++) {
                    c = a + b;
                    a = b;
                    b = c;
                }
                return b;
            }

            public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                for (int i = 0; i < n; i++ ) {
                    int index = scanner.nextInt();
                    System.out.printf("Fib(%d) = %d\n",index,fib(index));
                }
            }
        }
