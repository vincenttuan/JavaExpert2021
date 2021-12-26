package day03;

public class ex36 {

    public static void main(String[] args) {
        // while
        /*
        while(進入迴圈的條件){
            執行區塊
        }
         */
        // 1-10 的合計
        /*
        int i = 1, sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum = " + sum);
         */

        // do ~ While
        /*
        do{
            執行區塊
        }while(進入迴圈的條件);
         */
        int i = 1, sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= 10);
        System.out.println("sum = " + sum);
    }

}
