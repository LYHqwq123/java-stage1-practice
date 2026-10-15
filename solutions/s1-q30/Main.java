public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int rooster = 0; rooster <= 100 / 3; rooster++) {
            for (int hen = 0; hen <= 100 / 5; hen++) {
                int chick = 100 - rooster - hen;
                if (chick >= 0 && chick % 3 == 0
                        && 3 * rooster + 5 * hen + chick / 3 == 100) {
                    System.out.println("公鸡=" + rooster + " 母鸡=" + hen + " 小鸡=" + chick);
                    count++;
                }
            }
        }
        System.out.println("方案数=" + count);
    }
}
