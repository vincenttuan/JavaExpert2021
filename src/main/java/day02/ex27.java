package day02;

public class ex27 {

    public static void main(String[] args) {
        // ex: 二數交換
        // 原本：a = 5, b = 8
        // 結果：a = 8, b = 5

        int a = 5, b = 8, tmp;
        //交換前
        System.out.println("befor:a = " + a + ", b = " + b);
        
        //二數交換
        tmp = a;
        a=b;
        b=tmp;
        
        //交換後
        System.out.println("after:a = " + a + ", b = " + b);

    }

}
