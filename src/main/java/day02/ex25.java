package day02;

public class ex25 {

    public static void main(String[] args) {
        // TODO code application logic here

        // 任意三數，找出最大值
        int a = 5, b = 8, c = 3;
        int max = a;    // max=5
        int min = a;    // min=5
        //第二個數字
        if (b > max) {  // 8 > 5
            max = b;    // max = 8
        } else {
            if (b < min) {
                min = b;
            }
        }
        //第三個數字
        if (c > max) {
            max = c;
        }else{
            if(c < min){
                min = c;
            }
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }

}
