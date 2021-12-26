package day07;

import java.util.Arrays;

public class ex71d {

    public static void main(String[] args) {
        //排序
        int[] a = {8, 5, 3, 9, 6, 10, 1};
        Arrays.sort(a);
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        //搜尋:binarySearch(陣列名稱, 搜尋值) => 使用二分搜尋法前 ★必須要排序，否則會找不到★
        //System.out.println(Arrays.binarySearch(a, 55));
        int curPos = Arrays.binarySearch(a, 6);
        if (curPos >= 0) {
            //System.out.println("找到了，在第" + curPos + "個位置");
            System.out.printf("找到了，在第%d個位置\n", curPos);
        } else {
            System.out.println("not found!");
        }
    }

}
