package day07;

import java.util.Arrays;

public class ex71c {

    public static void main(String[] args) {
        // sort():陣列排序，由小到大的遞增方式
        /*
        //全排
        int[] a = {8, 5, 3, 9, 6};
        Arrays.sort(a);
        for (int i = 0; i <= a.length-1; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        */

        //指定範圍的排序:sort(陣列名稱,起,迄)
        int[] b = {3, 8, 5, 6, 9};
        Arrays.sort(b,1,4);
        for (int i = 0; i <= b.length-1; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
    }

}
