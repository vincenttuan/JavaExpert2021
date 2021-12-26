package day03;

public class ex33 {

    public static void main(String[] args) {
        /*
        1   1
        2   3
        3   6
        4   10
        5   15
         */

        int tot = 0;
        for (int i = 1; i <= 5; i++) {
            tot = tot + i;  //先合計
            //System.out.println(i+"\t"+tot);
            //System.out.println("第" + i + "列 => " + i + "\t" + tot);
            System.out.printf("第 %d 列 => %d \t %d \n",i,i,tot);
        }
    }
}
