package day03;

public class ex3a {

    public static void main(String[] args) {
        // 一維陣列
        // 陣列宣告(起始位置從0開始)
        int a[] = new int[5];   // 0-4
        int[] b = new int[5];   // 0-4

        // 初始化
        int c[] = {1, 2, 3, 4, 5};
        // 把c陣列的值給a與b陣列
        for (int i = 0; i <= 4; i++) {
            a[i] = c[i];
            b[i] = c[i];
        }
        // 印出a,b,c陣列的結果
        int len = 5;
        for (int j = 0; j <= len-1; j++) {
            //System.out.print("陣列第" + j + "位置 => ");
            //System.out.print(a[j] + ", ");
            //System.out.print(b[j] + ", ");
            //System.out.println(c[j]);
            
            System.out.print(a[j]);
            if(j<len-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        /*
        System.out.println("----------------------");        
        System.out.print("a陣列的值 => ");   
        for (int k : a) {
            System.out.print(k);
        }
        System.out.println();
        System.out.print("b陣列的值 => ");   
        for (int k : b) {            
            System.out.print(k);
        }
        System.out.println();
        System.out.print("c陣列的值 => ");   
        for (int k : c) {            
            System.out.print(k);
        }
        System.out.println();
        */
        

        // 讀取c陣列第0個位置的值
        /*
        System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(c[0]);
        System.out.println("----------------------");
         */
        // 讀取c陣列第0個位置的值後，給a陣列的第0個位置,給b陣列的第0個位置
        /*
        a[0] = c[0];
        b[0] = c[0];
        System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(c[0]);
         */
    }

}
