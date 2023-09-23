package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    static int N = (int) 2e6;
    static int[] prime = new int[N + 5];

    
    static void find() {
        for (int i = 2; i * i <= N; i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    if (prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (prime[i] == 0) {
                prime[i] = i;
            }
        }
    }

    public static int cal(int n) {
        int sum = 0;
        while (n != 1) {
            sum += prime[n];
            n /= prime[n];
        }
        return sum;
    }

    public static void main(String[] args) {
        find();
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int x = ip.nextInt();
            sum += cal(x);
        }
        System.out.println(sum);
    }
    
}