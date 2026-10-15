public class Main {
    public static void main(String[] args) {
        double numerator = 2;
        double denominator = 1;
        double sum = 0;
        for (int i = 1; i <= 30; i++) {
            sum = sum + numerator / denominator;
            double next = numerator + denominator;
            denominator = numerator;
            numerator = next;
        }
        System.out.printf(java.util.Locale.US, "%.6f%n", sum);
    }
}
