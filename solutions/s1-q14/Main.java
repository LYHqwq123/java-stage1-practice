import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        if (n < 1 || n > 18 || a < 0 || a > 9) {
            System.out.println("要求1<=n<=18且0<=a<=9");
            return;
        }
        long term = 0;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            term = term * 10 + a;
            sum = sum + term;
        }
        System.out.println(sum);
    }
}
