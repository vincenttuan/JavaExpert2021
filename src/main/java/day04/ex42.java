package day04;

import java.util.Scanner;

public class ex42 {

    public static void main(String[] args) {
        // 輸入5位同學的分數到陣列中
        // 可以透過學生座號來查詢分數
        /*
            座號：1
            請輸入成績：11
            座號：2
            請輸入成績：22
            座號：3
            請輸入成績：33
            座號：4
            請輸入成績：44
            座號：5
            請輸入成績：55
            -----------------
            總分:165
            總平均：33.00
            最高分：5號 => 55分
            最低分：1號 => 11分        
            -----------------
            查詢成績
            請輸入座號：3
            成績：33        
         */

        int a[] = new int[5];
        int i, fno;
        int sum = 0, max = 0, maxNo=0, min = 0, minNo=0;    // 總分, 最高, 最高座號, 最低, 最低座號
        double avg = 0.0;             // 總平均
        Scanner keyboard = new Scanner(System.in);
        for (i = 0; i <= a.length-1; i++) { //i++ => (i=i+1)
            System.out.println("座號：" + (i + 1));
            System.out.print("請輸入成績：");
            a[i] = keyboard.nextInt();

            // 最高分與最低分的處理
            if (i == 0) {
                // 第一次的分數，預設給最高與最低
                maxNo = i + 1;
                max = a[i];
                minNo = i + 1;
                min = a[i];
            } else {
                // 第二次後的分數，檢查最高分
                if (a[i] > max) {
                    max = a[i];
                    maxNo = i + 1;
                }
                // 第二次後的分數，檢查最低分
                if (a[i] < min) {
                    min = a[i];
                    minNo = i + 1;
                }
            }
            // 總分
            sum = sum + a[i];
        }
        // 總平均 = 總分 / 學生人數
        avg = (double) sum / a.length;   // 使用陣列長度當分母
        System.out.println("-----------------");
        System.out.printf("總　分: %d 分 \n", sum);
        System.out.printf("總平均: %.2f 分 \n", avg);
        System.out.printf("最高分: %d號 => %d 分 \n", maxNo, max);
        System.out.printf("最低分: %d號 => %d 分 \n", minNo, min);
        System.out.println("---------------------");
        System.out.println("查詢成績");
        do {
            System.out.print("請輸入座號：");
            fno = keyboard.nextInt();                   //得到欲查詢成績的座號
            if (fno == 0) {
                System.out.println("查詢完畢！");
                break;
            }
            System.out.println("成績：" + a[fno - 1]);   //得到座號的成績            
        } while (fno > 0);
    }

}
