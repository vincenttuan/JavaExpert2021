package day06;

public class ex63 {
    
    public static void main(String[] args) {
        // 公用類別庫介紹
        // JAVA已事先完成許多類別，提供可以解決問題的資料欄位與方法成員，善用可以事半功倍
        // 數值處理
        // 絕對值 => abs(int/long/float/double x)

        /*
        double a = -8.6;
        double b = 8.6;        
        System.out.println(a + "的絕對值=" + Math.abs(a));
        System.out.println(b + "的絕對值=" + Math.abs(b));
         */
        // 傳回大於等於某值的最大整數 => ceil(double x)
        /*
        System.out.println(a + "的最大整數=" + Math.ceil(a));
        System.out.println(b + "的最大整數=" + Math.ceil(b));
         */
        // 傳回小於等於某值的最小整數 => floor(double x)
        /*
        System.out.println(a + "的最小整數=" + Math.floor(a));
        System.out.println(b + "的最小整數=" + Math.floor(b));
         */
        // x值的y次方 => pow(x, y) 2的3次方
        //System.out.println("2的3次方：" + Math.pow(2, 3));
        // 開根號 => sqrt(double x)
        //System.out.println("4的根號：" + Math.sqrt(4));
        // 最大值 => max() -->任意二數的最大值
        //System.out.println("5與8 的最大值：" + Math.max(5, 8));
        // 最小值 => min() -->任意二數的最小值
        //System.out.println("5與8 的最大值：" + Math.min(5, 8));
        // 亂數 => random() --> 0 ~ 1 的隨機值
        //System.out.println("亂數：" + Math.random());
        // 四捨五入 => round(浮點數值)
        //System.out.println(Math.round(3.5));
        /*
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(-3.2));
        System.out.println(Math.round(Math.floor(-3.5)));
        */
        
        // 輸入 1.234，指定 2 => 1.23
        //System.out.println(Math.round(1.234*100)/100.0);
        System.out.println(Math.round(1.234*(Math.pow(10, 1)))/Math.pow(10, 1));
        
        // 輸入 12500, 指定-4 => 13000        

    }
    
}
