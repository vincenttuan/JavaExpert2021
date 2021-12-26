package day02;

public class ex23 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
            請輸入一個分數 0-100
            1.當分數大於等於 90 分時，輸出 A
            2.當分數介於 80-89  分時，輸出 B
            3.當分數介於 70-79  分時，輸出 C
            4.當分數介於 0-69   分時，輸出 D
         */

        int a = 99;
        String b = "";
        // if --- elseif --- else
        /*
            if (條件A){
                執行條件A的程式敘述
            }else if (條件B){
                執行條件B的程式敘述
            }else if (條件C){
                執行條件D的程式敘述
            }else if(....){
                執行條件N的程式敘述
            }
        */
        if (a < 0 || a > 100) {
            b = "err";
        } else {
            if (a >= 90 && a <= 100) {
                b = "A";
            }else if (a >= 80 && a <= 89) {
                b = "B";
            }else if (a >= 70 && a <= 79) {
                b = "C";
            }else if (a >= 0 && a <= 69) {
                b = "D";
            }
        }
        System.out.println(b);
    }

}
