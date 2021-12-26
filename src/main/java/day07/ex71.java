package day07;

import java.util.Arrays;

public class ex71 {

    public static void main(String[] args) {
        // 陣列處理
        // 填滿:fill()
        int[] a = new int[5];
        //寫入陣列：5個3到陣列中
        Arrays.fill(a, 3);
        /*
        for(int i=0;i<=a.length-1;i++){
            a[i]=3;
        }
        */
        //輸出陣列
        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]);
        }
        System.out.print("\n--------------\n");
        
        
        //38833 => 起迄範圍: >=起始位置 and < 結束位置
        Arrays.fill(a, 1, 3, 8);
        //輸出陣列
        for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]);
        }
        System.out.println();        
    }

}
