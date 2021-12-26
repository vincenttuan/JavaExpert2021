package day05;

public class ex56 {

    // 接收一個陣列後*2，直接給傳送過來的另一個陣列，不需要回傳
    static void doubleData2(int[] arr1, int[] arr2) {
        int intLength = arr1.length;
        for (int i = 0; i <= intLength - 1; i++) {
            arr2[i] = arr1[i] * 2;
        }
    }

    static void arrPrint(int[] arr1) {
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = new int[a.length];
        doubleData2(a, b);
        arrPrint(b);
    }

}
