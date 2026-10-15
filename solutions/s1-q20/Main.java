public class Main {
    public static void main(String[] args) {
        int[] a = {8, 6, 5, 4, 1};
        for (int i = 0; i < a.length / 2; i++) {
            int j = a.length - 1 - i;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
