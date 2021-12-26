package day02;

public class ex26 {

    public static void main(String[] args) {
        // ex: 任意四個數值，由小到大輸出

        int a = 5, b = 8, c = 3, d = 10, tmp;
        //排序前
        System.out.println("befor:a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        //排序過程
        //第一輪
        //a>b => a,b交換
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        //b>c => b,c交換
        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }
        //c>d => c,d交換
        if (c > d) {
            tmp = c;
            c = d;
            d = tmp;
        }
        //第二輪
        //a>b => a,b交換
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        //b>c => b,c交換
        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }
        //第三輪
        //a>b => a,b交換
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        
        //排序後 3 5 8 10
        System.out.println("after:a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

    }

}
