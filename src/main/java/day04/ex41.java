package day04;

public class ex41 {

    public static void main(String[] args) {
        // 2,4,7,1,5
        // 請用陣列儲存以上資料
        // 計算總合
        // 以上資料*2後，逐一複製到另一陣列
        // -----------------------------------
        int a[] = {2, 4, 7, 1, 5};    //int[] a={2,4,7,1,5};
        int b[] = new int[5];
        int i, s = 0;        
        for (i = 0; i <= 4; i++) {
            // a陣列資料輸出            
            System.out.print(a[i] + " ");
            // 合計
            s = s + a[i];   
            // a陣列值取出*2，給陣列b
            b[i]=a[i]*2;
        }
        System.out.println();
        System.out.println("sum=" + s);
        //輸出陣列b
        for(i=0;i<=4;i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
