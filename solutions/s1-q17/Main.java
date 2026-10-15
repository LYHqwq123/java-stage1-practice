import java.util.Scanner;
public class Main {
    public static boolean is(int number) {
        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;
        return a * a * a + b * b * b + c * c * c == number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m < 0 || m > 1000) {
            System.out.println("要求0<=m<=1000");
            return;
        }
        boolean found = false;
        for (int i = 100; i <= m && i <= 999; i++) {
            if (is(i)) {
                if (found) System.out.print(" ");
                System.out.print(i);
                found = true;
            }
        }
        if (!found) System.out.print("无");
        System.out.println();
    }
}
