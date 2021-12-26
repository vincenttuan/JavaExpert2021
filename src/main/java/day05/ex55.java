package day05;

public class ex55 {

    // 接收一個陣列後*2，再回傳
    static int[] doubleData(int arr1[]) {
        int intLength = arr1.length;
        int[] arr2 = new int[intLength];
        for (int i = 0; i <= intLength - 1; i++) {
            arr2[i] = arr1[i] * 2;
        }
        return arr2;
    }

    public static void main(String[] args) {
        /* 1.建立一個整數陣列在主程式，並且初始化
           2.將陣列資料傳送到自訂的方法中，並且將陣列中的資料*2
           3.再以另一個陣列傳回主程式後輸出
         */

        int[] a = {1, 2, 3, 3, 2, 1};
        int[] b = doubleData(a);
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
