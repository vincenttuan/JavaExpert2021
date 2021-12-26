package day07;

import java.util.Calendar;

public class ex72b {

    public static void main(String[] args) {
        // 日期運算與處理
        // 設定日期與時間:set()
        Calendar a = Calendar.getInstance();
        //2021/5/20
        a.set(Calendar.YEAR, 2021);  //設定年
        a.set(Calendar.MONTH, 4);   //設定月
        a.set(Calendar.DATE, 20);   //設定日
        //a.set(Calendar.HOUR_OF_DAY, 23);   //設定時=>24小時制
        //a.set(Calendar.MINUTE, 55);   //設定分
        System.out.println(a.getTime());
        
        //後15天的日期 => 天數
        a.add(Calendar.DATE, 15);
        System.out.println(a.getTime());
        
        //前10天的日期 => -天數
        a.add(Calendar.DATE, -10);
        System.out.println(a.getTime());
        
        //三個月後的第二天
        a.add(Calendar.DATE, 2);
        a.add(Calendar.MONTH, 3);
        System.out.println(a.getTime());
        
        //roll():限定月份（留意跨月的問題）
        a.set(2021,Calendar.DECEMBER, 31);
        a.roll(Calendar.DATE, 2);  
        System.out.println(a.getTime());
        a.roll(Calendar.DATE, -2); 
        System.out.println(a.getTime());
        
        
        
    }

}
