import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine().replace(" ", "");
        int position = -1;
        for (int i = 1; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                position = i;
                break;
            }
        }
        if (position == -1) {
            System.out.println("表达式格式错误");
            return;
        }
        double a = Double.parseDouble(expression.substring(0, position));
        double b = Double.parseDouble(expression.substring(position + 1));
        char op = expression.charAt(position);
        double result = 0;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("除数不能为0");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("不支持的运算符");
                return;
        }
        String answer;
        if (result >= Long.MIN_VALUE && result < Long.MAX_VALUE
                && result == (long) result) {
            answer = String.valueOf((long) result);
        } else {
            answer = String.valueOf(result);
        }
        System.out.println(expression + "=" + answer);
    }
}
