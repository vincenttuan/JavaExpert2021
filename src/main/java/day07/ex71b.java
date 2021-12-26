package day07;

import java.util.Arrays;

public class ex71b {

    public static void main(String[] args) {
        // equals():檢查陣列是否相等
        int[] a = {3, 8, 2};
        int[] b = {3, 8, 5};
        //System.out.println(Arrays.equals(a, b));
        if (Arrays.equals(a, b)) {
            System.out.println("陣列內容相同");
        }else{
            System.out.println("陣列內容不同");
        }
    }

}
