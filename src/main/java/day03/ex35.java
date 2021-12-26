package day03;

public class ex35 {

    public static void main(String[] args) {
        // break => 中斷執行且結束 與 continue => 忽略

        // 1-10
        // 當 i==5 時，不列印 5
        // 當 i==8 時，結束
        /*
            i = 1
            i = 2
            i = 3
            i = 4
            i = 6
            i = 7
            sum = 23
            離開迴圈時，i = 8
         */
        int i, sum = 0, count = 0;
        for (i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;   // 跳過這一次(忽略)
            }
            if (i == 8) {
                break;      // 結束迴圈
            }
            //System.out.println("i = " + i);
            count++;    //計次
            System.out.printf("i = %d\n", i);
            sum = sum + i;  // 合計
        }
        //System.out.println("sum = " + sum);
        System.out.printf("sum = %d\n" , sum);
        System.out.printf("avg = %.2f\n" , (double)sum/count);
        //System.out.println("離開迴圈時，i = " + i);
        System.out.printf("離開迴圈時，i = %d\n" , i);
    }
}
