import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (sc.hasNextDouble()) {
            double value = sc.nextDouble();
            if (value == 0) break;
            count++;
            sum += value;
        }
        double average = 0;
        if (count > 0) average = sum / count;
        System.out.printf(java.util.Locale.US, "%d %.1f%n", count, average);
    }
}
