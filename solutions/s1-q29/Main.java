import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1000 || n > 9999) {
            System.out.println("请输入四位正整数");
            return;
        }
        int thousands = n / 1000;
        int hundreds = n / 100 % 10;
        int tens = n / 10 % 10;
        int units = n % 10;
        if (thousands == units && hundreds == tens) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
