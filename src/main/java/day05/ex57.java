package day05;

public class ex57 {

    // 計算階乘
    static int product(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * product(n - 1);
        }
    }

    public static void main(String[] args) {
        // 遞迴(Recursion):自己呼叫自己

        // 階乘運算 5! = 5 * 4 * 3 * 2 * 1
        int a = 3;
        int sum = product(a);
        System.out.printf("%d!=%d\n", a, sum);
    }

}
