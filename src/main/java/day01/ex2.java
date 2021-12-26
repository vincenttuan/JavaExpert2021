package day01;
// 載入Scanner類別

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        // TODO code application logic here
        // 建立一個 Scanner 物件
        Scanner keyboard = new Scanner(System.in);
        System.out.print("請輸入任意字:");
        // 建立整數變數 a
        // int a;
        // double a;
        String a;
        // 輸入資料給變數 a
        //a = keyboard.nextInt();
        //a = keyboard.nextDouble();
        a = keyboard.next();
        // 輸出變數 a
        //System.out.print("輸入任意為:");
        System.out.println("輸入為:" + a);
    }
}
