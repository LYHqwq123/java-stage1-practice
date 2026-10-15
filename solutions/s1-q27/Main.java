import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) a[i][j] = sc.nextInt();
        }
        int max = a[0][0], min = a[0][0];
        int maxRow = 0, maxCol = 0, minRow = 0, minCol = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j] > max) {
                    max = a[i][j]; maxRow = i; maxCol = j;
                }
                if (a[i][j] < min) {
                    min = a[i][j]; minRow = i; minCol = j;
                }
            }
        }
        System.out.println("最大值=" + max + " 行=" + (maxRow + 1) + " 列=" + (maxCol + 1));
        System.out.println("最小值=" + min + " 行=" + (minRow + 1) + " 列=" + (minCol + 1));
    }
}
