import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y;
        if (x <= 0) {
            y = x * x * x + 5;
        } else if (x <= 20) {
            y = x * x - x + 3;
        } else {
            y = 7 * x + 2;
        }
        System.out.printf(java.util.Locale.US, "%.2f%n", y);
    }
}
