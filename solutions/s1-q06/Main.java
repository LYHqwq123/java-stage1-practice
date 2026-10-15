import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        if (k <= 0) {
            System.out.println("请输入正整数");
            return;
        }
        long temp = k;
        int count = 0;
        String reverse = "";
        while (temp > 0) {
            reverse = reverse + temp % 10;
            count++;
            temp = temp / 10;
        }
        System.out.println(count);
        System.out.println(reverse);
    }
}
