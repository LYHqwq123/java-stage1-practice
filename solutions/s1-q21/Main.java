public class Main {
    public static void main(String[] args) {
        int[] f = new int[30];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < f.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(f[i]);
        }
        System.out.println();
    }
}
