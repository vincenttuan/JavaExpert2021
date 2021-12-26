package day04;

public class ex44 {

    public static void main(String[] args) {
        // 陣列資料排序(泡沫排序法 => 小到大)
        /*
                         20 21 12 17 23
            第一輪4次    20 12 17 21
            第二輪3次    12 17 20
            第三輪2次    12 17
            第四輪1次    12
            結果         12 17 20 21 23
         */

        int a[] = {0, 20, 21, 12, 17, 23};
        int i, j, tmp;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                // 二數檢查，前值 > 後值，二數交換

                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        for (i = 1; i <= 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

}
