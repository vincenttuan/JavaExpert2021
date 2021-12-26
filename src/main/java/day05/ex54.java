package day05;

public class ex54 {
    
    static void showData(int arr[]){
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 方法：陣列的傳遞
        int[] a = {1, 2, 3, 4, 5};
        showData(a);   //將陣列a傳給方法輸出
    }

}
