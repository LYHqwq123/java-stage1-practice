public class Main {
    public static boolean is(int number) {
        if (number < 100 || number > 999) return false;
        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;
        return a * a * a + b * b * b + c * c * c == number;
    }
    public static void main(String[] args) {
        boolean first = true;
        for (int i = 100; i <= 999; i++) {
            if (is(i)) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }
}
