public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 4; b++) {
                for (int c = 1; c <= 4; c++) {
                    if (a != b && a != c && b != c) {
                        if (count > 0) System.out.print(" ");
                        System.out.print(100 * a + 10 * b + c);
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("总数=" + count);
    }
}
