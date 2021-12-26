package day02;

public class ex21 {

    public static void main(String[] args) {
        // TODO code application logic here
        // if ... else
        int a = 88;
        if (a < 0 || a > 100) {//檢查分數是否在 0 - 100之間
            System.out.println("分數範圍 err！ 0-100之間");
        } else {
            if (a >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }
    }
}
