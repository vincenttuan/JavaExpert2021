package day03;

public class ex34 {

    public static void main(String[] args) {
        /*
            *
            **
            ***
            ****
            *****
            *****
            ****
            ***
            **
            *
         */
        // 1-5 星星
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 5-1 星星
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }        
    }
}
