package day03;

import java.util.Scanner;

public class ex38 {

    public static void main(String[] args) {
        /*
            請輸入分數(-1結束):60
            請輸入分數(-1結束):80
            請輸入分數(-1結束):40
            請輸入分數(-1結束):101
            分數輸入錯誤，請重新輸入(0-100)!
            請輸入分數(-1結束):50
            請輸入分數(-1結束):-22
            分數輸入錯誤，請重新輸入(0-100)!
            請輸入分數(-1結束):33
            請輸入任一數(-1結束):-1
            -----------------------------
            　及格數:2
            不及格數:3
            　總人數:5
            　總合計:263
              總平均:52.6
         */

        int score, count = 0, sum = 0, pass = 0, fail = 0;
        double avg = 0.0;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("請輸入任一數(-1結束):");
            score = keyboard.nextInt();
            //是否結束
            if (score == -1) {
                break;
            }
            //檢查分數是否在有效範圍內 0-100
            if (score < 0 || score > 100) {
                System.out.println("分數輸入錯誤，請重新輸入(0-100)!");
                continue;
            }
            if (score >= 60) {
                //及格
                pass++;
            } else {
                //不及格
                fail++;
            }
            count++;                // 人數計次
            sum = sum + score;      // 合計累加
        } while (score != -1);

        System.out.printf("-----------------------------\n");
        System.out.printf("及格數: %d \n", pass);
        System.out.printf("不及格: %d \n", fail);
        System.out.printf("總人數: %d \n", count);
        System.out.printf("總　分: %d \n", sum);
        // 檢查分母是否 > 0
        if (count > 0) {
            avg = (double) sum / count;
        }
        System.out.printf("總平均: %.2f \n", avg);
    }
}
