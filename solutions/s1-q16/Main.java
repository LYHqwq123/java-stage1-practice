import java.util.Scanner;
public class Main {
    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a / gcd(a, b) * b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("两个0的最大公约数无定义");
            return;
        }
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}
