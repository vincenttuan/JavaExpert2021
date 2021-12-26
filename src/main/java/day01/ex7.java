/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day01;

/**
 *
 * @author MB-201
 */
public class ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // And (交集) &&
        /*
           true  && true    => true
           true  && false   => false
           false && true    => false
           false && false   => false
         */
        // Or (聯集)  ||
        /*
           true  || true    => true
           true  || false   => true
           false || true    => true
           false || false   => false
         */
        //System.out.println(!(3<5));
//        int score = 66;
//        if(score>=60){
//            System.out.println("及格");
//        }else{
//            System.out.println("不及格");
//        }
        //三元條件運算子
        //條件式?條件成立:條件不成立
//        boolean result = (score >= 60) ? true : false;
//        System.out.println(result);
        int a = 5, b = 3;
        int c;
//        if(a>b){
//            c=a;
//        }else{
//            c=b;
//        }
        c = (a > b) ? a : b;
        System.out.println(c);

    }
}
