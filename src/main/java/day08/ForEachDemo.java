package day08;

import java.util.Arrays;

public class ForEachDemo {
    public static void main(String[] args) {
        double[] scores = {100, 90, 85};
        // 使用 for-loop
        for(int i=0;i<scores.length;i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        // 使用 for-in(each)
        for(double score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        // 使用 Arrays.toString()
        System.out.println(Arrays.toString(scores));
    }
}
