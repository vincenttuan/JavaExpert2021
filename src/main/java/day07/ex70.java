package day07;

public class ex70 {

    public static void main(String[] args) {
        // 輸入任意字串 => Hi, Java!
        // 結果 => hI, jAVA!
        /* 
            1.使用迴圈逐字檢查
            2.大寫->小寫
            3.小寫->大寫
            4.二者不是，不處理
         */
        //String str1 = "Hi, Java!";
        String str1 = "H";
        char a; //取得目前位置的值
        char b; //取得目前位置的值變大寫
        char c; //取得目前位置的值變小寫
        for (int i = 0; i <= str1.length() - 1; i++) {
            System.out.print(str1.charAt(i));
            System.out.print(" => ");
            a = (char) str1.charAt(i);     //目前值
            b = Character.toUpperCase(a);   //變大寫
            c = Character.toLowerCase(a);   //變小寫

//            System.out.println("a=" + a);
//            System.out.println("b=" + b);
//            System.out.println("c=" + c);
            if (a == b) {   //大寫
                //System.out.println(str1.replace(a, c));
                str1 = str1.replace(a, c);  //轉小寫
            } else {    //小寫
                //System.out.println(str1.replace(a, b));
                str1 = str1.replace(a, b);  //轉大寫
            }
        }
        System.out.println(str1);
    }

}
