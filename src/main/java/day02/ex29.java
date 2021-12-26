package day02;

public class ex29 {

    public static void main(String[] args) {
        // 迴圈的種類
        // for      => 已知執行的次數
        // do       => 未知執行的次數，直到結束的條件才離開迴圈
        // while    => 未知執行的次數，直到結束的條件才離開迴圈

//        System.out.println("Hello1");
//        System.out.println("Hello2");
//        System.out.println("Hello3");
//        System.out.println("Hello4");
//        System.out.println("Hello5");
        //for(起始變數;進入迴圈的條件;增值或減值)
        //for (int i = 1; i <= 5; i++) {
        //System.out.print("Hello");
        //System.out.println(i);
        //System.out.println("Hello" + i);
        //}
        // 1+2+3+..+10=?
//        int tot = 0;
//        for (int i = 1; i <= 10; i++) {
//            tot = tot + i;  //tot += i; 累計
//        }
//        System.out.println("1+2+3+...+10=" + tot);
        // 1-10 偶數合? 2,4,6,8,10
        int tot1 = 0;
        for (int i = 2; i <= 10; i += 2) {
            tot1 = tot1 + i;
        }
        System.out.println("1-10偶數合:" + tot1);
        // -----------------------------------------
        int tot2 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {   // 跟2取餘數
                tot2 = tot2 + i;
            }
        }
        System.out.println("1-10偶數合:" + tot2);

    }

}
