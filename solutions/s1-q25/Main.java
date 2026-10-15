import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (leap) days[1] = 29;
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("日期不合法");
            return;
        }
        if (day < 1 || day > days[month - 1]) {
            System.out.println("日期不合法");
            return;
        }
        int total = day;
        for (int i = 0; i < month - 1; i++) total += days[i];
        System.out.println(total);
    }
}
