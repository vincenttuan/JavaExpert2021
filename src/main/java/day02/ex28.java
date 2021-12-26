package day02;
import java.util.Scanner;
public class ex28 {

    public static void main(String[] args) {
        // 0=>剪刀 1=>石頭 2=>布
        // user:手動輸入 (0, 1, 2)
        Scanner keyboard = new Scanner(System.in);
        System.out.print("請輸入代號（0=>剪刀 1=>石頭 2=>布）:");
        //int a  = 1;
        int a = keyboard.nextInt();
        String a1 = "";
        switch (a) {
            case 0:
                a1 = "剪刀";
                break;
            case 1:
                a1 = "石頭";
                break;
            case 2:
                a1 = "布";
                break;
            default:
                a1 = "Err";
        }
        // 電腦:亂數(0, 1, 2)
        int b;
        b = (int) (Math.floor(Math.random() * 3));    //亂數產生數值 => 0,1,2 (其一)
        String b1 = "";
        if (b == 0) {
            b1 = "剪刀";
        } else if (b == 1) {
            b1 = "石頭";
        } else if (b == 2) {
            b1 = "布";
        }
        //處理的過程
        String r = "";    // 存放結果
        switch (a) {
            case 0:
                //電腦的三種狀態
                if (b == 0) {//剪刀
                    r = "平手";
                } else if (b == 1) {//石頭
                    r = "電腦贏";
                } else if (b == 2) {//布
                    r = "user贏";
                }
                break;
            case 1:
                //電腦的三種狀態
                if (b == 0) {//剪刀
                    r = "user贏";
                } else if (b == 1) {//石頭
                    r = "平手";
                } else if (b == 2) {//布
                    r = "電腦贏";
                }
                break;
            case 2:
                //電腦的三種狀態
                if (b == 0) {//剪刀
                    r = "電腦贏";
                } else if (b == 1) {//石頭
                    r = "user贏";
                } else if (b == 2) {//布
                    r = "平手";
                }
                break;
        }

        //結果
        System.out.println("你出:" + a + "=>" + a1);
        System.out.println("電腦:" + b + "=>" + b1);
        if(a<0 || a>2){
            System.out.println("結果:Err" ); 
        }else{
            System.out.println("結果:" + r);    
        }        
    }
}
