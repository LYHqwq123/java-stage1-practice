import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n必须大于0");
            return;
        }
        int max = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();
            if (value > max) max = value;
        }
        System.out.println("max=" + max);
    }
}
