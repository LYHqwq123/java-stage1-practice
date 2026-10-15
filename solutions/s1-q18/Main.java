public class Main {
    public static long fact(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
    public static void main(String[] args) {
        long sum = fact(4) + fact(7) + fact(8);
        System.out.println(sum);
    }
}
