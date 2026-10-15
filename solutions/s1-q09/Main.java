import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("请输入正整数");
            return;
        }
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
