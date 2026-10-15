public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int sign = 1;
        for (int i = 1; i <= 101; i += 2) {
            sum = sum + sign * i;
            sign = -sign;
        }
        System.out.println(sum);
    }
}
