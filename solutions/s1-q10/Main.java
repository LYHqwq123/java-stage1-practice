import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n <= 10000) {
            System.out.println("n必须大于10000");
            return;
        }
        for (int i = 999; i >= 100; i--) {
            if (n % i == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("不存在三位数约数");
    }
}
