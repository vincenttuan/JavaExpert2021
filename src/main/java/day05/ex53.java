package day05;

public class ex53 {
    //建立方法的地方
    //存取範圍修飾字: public / private / protected / static

    // 建立一個有回傳值、有參數的方法
    /*
    static 型別 方法名稱(參數1, 參數2..){
        //處理程式。。。
        return 同方法的型別資料;
    }
     */
    // 建立一個格查分數的方法(method)
    static String checkScore(int s) {
        String str = "";
        if (s < 0 || s > 100) {
            //return "Err! 有效範圍是(0-100)";
            str = "Err! 有效範圍是(0-100)";
            return str;
        }
        if (s >= 60) {
            //return "及格";
            str = "及格";
        } else {
            //return "不及格";
            str = "不及格";
        }
        return str;
    }

    // 建立一個沒有回傳值的方法
    static void pr(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        // 方法(method)
        /*
            在程式設計時，常會遇到某些程式片段需要在同一個或不同的地方重覆出現N次，
            會造成日後維護上的不便性之外，也有可能在調整程式時，漏掉修改，導致資料不一致的情況，
            因此可以考慮將這些重覆的的片段程式，集中管理，自訂方法來使用。
        
            自訂方法，有回傳值(return)
            自訂方法，無回傳值(void)
         */
        int score = -1;
        String str1;
        str1 = checkScore(score);   // 呼叫有回傳值的方法，通常會有一個接收者(可以是變數或是直接輸出)
        pr(str1);                   // 呼叫沒有回傳值的方法
        //System.out.println(checkScore(score));  //呼叫方法後，列印結果
    }

}
