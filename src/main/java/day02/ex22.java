package day02;

import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
            請輸入一個分數 0-100
            1.當分數大於等於 90 分時，輸出 A
            2.當分數介於 80-89  分時，輸出 B
            3.當分數介於 70-79  分時，輸出 C
            4.當分數介於 0-69   分時，輸出 D
         */
        // 限用 if ... else
        // 輸入a
        int a;
        //使用Scanner+變數的做法
        Scanner keyboard = new Scanner(System.in);
        System.out.print("請輸入分數:");
        a = keyboard.nextInt();
        String str = "";

        if (a < 0 || a > 100) {
            System.out.println("Err");            
        } else {
            if (a >= 90) {
                str = "A";
            } else {
                if (a >= 80) {
                    str = "B";
                } else {
                    if (a >= 70) {
                        str = "C";
                    } else {
                        str = "D";
                    }
                }
            }
            System.out.println (a + "的級數為:" + str);
        }
    }
        /*
        if (a < 0 || a > 100) {
            System.out.println("Err");
        } else {
            if (a >= 90) {
                System.out.println("A");
            } else {
                if (a >= 80 && a <= 89) {
                    System.out.println("B");
                } else {
                    if (a >= 70 && a <= 79) {
                        System.out.println("C");
                    } else {
                        if (a >= 0 && a <= 69) {
                            System.out.println("D");
                        }
                    }
                }
            }
        }
         */
}
