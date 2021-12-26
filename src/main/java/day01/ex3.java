package day01;

public class ex3 {

    public static void main(String[] args) {
        // TODO code application logic here

        // 建立變數
        int a = 5;
        int b = 3;    //初始化(第一次得到的值)
        /*
        if(條件式){
            條件成立敘述
        }else{
            條件不成立敘述
        }
         */
        //奇偶數檢查
        if (a % 2 != 0) {
            //System.out.println("5是3的倍數");
            System.out.println(a + "是奇數");
        } else {
            System.out.println(a + "是偶數");
        }

        //a是否為b的倍數檢查
        if (a % b == 0) {
            //System.out.println("5是3的倍數");
            System.out.println(a + "是" + b + "的倍數");
        } else {
            System.out.println(a + "不是" + b + "的倍數");
        }

        // 5+3=8
        /*
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));    //商數
        System.out.println(a + "%" + b + "=" + (a % b));    //餘數
         */
    }
}
