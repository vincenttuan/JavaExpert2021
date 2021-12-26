package day03;

public class ex32 {

    public static void main(String[] args) {
        // 巢狀迴圈:九九乘法表
        /*
            1*1=1 1*2=2 .... 1*9=9
            2*1=1 2*2=4 .... 2*9=18
            ~
            9*1=9 9*2=18 .... 9*9=81
         */

        for (int a = 1; a <= 9; a++) {//外層:垂直數列
            for (int b = 1; b <= 9; b++) {//內層: 水平數列
                // 1 * 1 = 1
                System.out.print(a + "*" + b + "=" + (a * b) + "\t");
            }
            //System.out.print('\n');     //使用跳脫字元換行
            System.out.println();       //使用method換行            
        }
    }
}
