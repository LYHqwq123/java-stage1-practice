import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m > n) {
            System.out.println("m不能大于n");
            return;
        }
        long sum = 0;
        for (long i = m; i <= n; i++) sum += i;
        System.out.println("S=" + sum);
    }
}
