package day03;

import java.util.Scanner;

public class ex37 {

    public static void main(String[] args) {
        // 請輸入任意數，直到輸入-1時結束，並且統計出個數與合計
        /*
            請輸入分數(-1結束):6
            請輸入分數(-1結束):8
            請輸入分數(-1結束):4
            請輸入任一數(-1結束):-1
            -----------------------------
            個數:3
            合計:18
         */
        int num, count = 0, sum = 0;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("請輸入任一數(-1結束):");
            num = keyboard.nextInt();
            if(num == -1){
                break;
            }
            count++;            // 次數累加
            sum = sum + num;    // 合計累加

        } while (num != -1);
        
        /*
        System.out.print("請輸入任一數(-1結束):");
        num = keyboard.nextInt();
        while (num != -1) {
            count++;            // 次數累加
            sum = sum + num;    // 合計累加

            System.out.print("請輸入任一數(-1結束):");
            num = keyboard.nextInt();
        }
        */

        System.out.printf("個數: %d \n", count);
        System.out.printf("合計: %d \n", sum);
    }

}
