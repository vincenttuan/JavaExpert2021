package day01;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        // TODO code application logic here

        // 請輸入一個半徑，計算如下
        // 圓周 = 3.14159 * 2r
        // 圓面積 = 3.14159 * r * r
        // 不使用變數的做法
        System.out.println("半徑5，圓周=" + (3.14159 * 2 * 5));
        System.out.println("半徑5，圓面積=" + (3.14159 * 5 * 5));
        System.out.println("-----------------------");
        // 使用變數的做法
        double pi = 3.14159;
        int r = 5;
        System.out.println("半徑" + r + "，圓周=" + (pi * 2 * r));
        System.out.println("半徑" + r + "，圓面積=" + (pi * r * r));
        System.out.println("-----------------------");
        //使用Scanner+變數的做法
        Scanner keyboard = new Scanner(System.in);
        System.out.print("請輸入半徑:");
        r = keyboard.nextInt();
        System.out.println("半徑" + r + "，圓周=" + (pi * 2 * r));
        System.out.println("半徑" + r + "，圓面積=" + (pi * r * r));
    }

}
