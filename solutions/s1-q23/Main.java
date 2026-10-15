import java.util.Scanner;
public class Main {
    public static double fun(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) sum += scores[i];
        return sum / scores.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("课程数必须大于0");
            return;
        }
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) scores[i] = sc.nextDouble();
        double average = fun(scores);
        System.out.printf(java.util.Locale.US, "%.2f%n", average);
    }
}
