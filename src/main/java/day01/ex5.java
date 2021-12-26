/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day01;

/**
 *
 * @author MB-201
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int count = 20;
        int a, b, c, d;

        //a = count + 1;  //count+1之後給a
        //a = count++;    //count++(先把count值指派給a後，再加1)
        //a = ++count;      //++count(先把count值+1後，指派給a)
        a = count++;    //a=20, count=21
        b = count;      //b=21, count=21
        c = ++count;    //c=22, count=22
        d = count + 1;  //d=23, count=22
        System.out.println(a + b + c + d);                  //86
        System.out.println("Result1=" + a + b + c + d);     //Result1=20212223
        System.out.println(a + b + "Result2=" + c + d);     //41Result2=2223
        System.out.println("Result3=" + a + (b + c) + d);   //Result3=204323
    }
}
