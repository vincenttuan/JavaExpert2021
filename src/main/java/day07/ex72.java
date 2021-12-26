package day07;

import java.util.Calendar;

public class ex72 {

    public static void main(String[] args) {
        // 時間處理
        // 建立一個 Calendar 物件給變數 a
        Calendar a = Calendar.getInstance();

        //顯示 Calendar 中的所有資訊
        //System.out.println(a.toString()); //很長...
        //日期+時間
        System.out.println(a.getTime());              //Fri Dec 24 11:25:51 CST 2021
        System.out.println(a.get(Calendar.YEAR));    //年：2021
        System.out.print(a.get(Calendar.MONTH));    //月：11（一月是0...十二月是11）
        System.out.println(" => " + (a.get(Calendar.MONTH) + 1) + " 月");
        System.out.print(a.get(Calendar.MONTH));    //月：11（一月是0...十二月是11）
        if (a.get(Calendar.MONTH) == 0) {System.out.println(" => 一月");}
        else if (a.get(Calendar.MONTH) == 1) {System.out.println(" => 二月");}
        else if (a.get(Calendar.MONTH) == 2) {System.out.println(" => 三月");}
        else if (a.get(Calendar.MONTH) == 3) {System.out.println(" => 四月");}
        else if (a.get(Calendar.MONTH) == 4) {System.out.println(" => 五月");}
        else if (a.get(Calendar.MONTH) == 5) {System.out.println(" => 六月");}
        else if (a.get(Calendar.MONTH) == 6) {System.out.println(" => 七月");}
        else if (a.get(Calendar.MONTH) == 7) {System.out.println(" => 八月");}
        else if (a.get(Calendar.MONTH) == 8) {System.out.println(" => 九月");}
        else if (a.get(Calendar.MONTH) == 9) {System.out.println(" => 十月");}
        else if (a.get(Calendar.MONTH) == 10) {System.out.println(" => 十一月");}
        else if (a.get(Calendar.MONTH) == 11) {System.out.println(" => 十二月");}
        
        /*
        switch(a.get(Calendar.MONTH)){
            case 0:
                System.out.println(" => 一月");
                break;
            case 1:
                System.out.println(" => 二月");
                break;
            case 2:
                System.out.println(" => 三月");
                break;
            case 3:
                System.out.println(" => 四月");
                break;
            case 4:
                System.out.println(" => 五月");
                break;
            case 5:
                System.out.println(" => 六月");
                break;
            case 6:
                System.out.println(" => 七月");
                break;
            case 7:
                System.out.println(" => 八月");
                break;
            case 8:
                System.out.println(" => 九月");
                break;
            case 9:
                System.out.println(" => 十月");
                break;
            case 10:
                System.out.println(" => 十一月");
                break;
            case 11:
                System.out.println(" => 十二月");
                break;            
        }
         */

        System.out.println(a.get(Calendar.DATE));    //日
        System.out.print(a.get(Calendar.DAY_OF_WEEK));    //星期幾(星期日是1, 星期一是2....)
        System.out.printf(" => 星期%d\n", a.get(Calendar.DAY_OF_WEEK) - 1);
        System.out.println(a.get(Calendar.HOUR_OF_DAY));    //時：24小時制
        System.out.println(a.get(Calendar.HOUR));            //時：12小時制
        if (a.get(Calendar.HOUR) < 12) {
            System.out.println(a.get(Calendar.HOUR) + "am");
        } else {
            System.out.println(a.get(Calendar.HOUR) + "pm");
        }
        System.out.println(a.get(Calendar.MINUTE));            //分
        System.out.println(a.get(Calendar.SECOND));            //秒
    }

}
