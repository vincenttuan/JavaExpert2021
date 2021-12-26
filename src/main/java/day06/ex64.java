package day06;

public class ex64 {

    public static void main(String[] args) {
        // 公用類別 => 字串處理
        //String a = "abcdef";
        //String b = "abcxyz";

        // 字串長度：lenght()
        //System.out.println("a長度 => " + a.length());
        // 串接：concat() 或 +
        //System.out.println("a+b => " + a + b);
        //System.out.println("a+b => " + a.concat(b));
        // 比較
        //System.out.println(a == b); //相等
        //System.out.println(a >= b);     //字串a > 字串b? Err:因為字串中沒有此運算子，所以要用方法(method)
        /*
        int d = a.compareTo(b); // 得到ANSI碼的運算結果
        System.out.println(d); 
        if (d == 0) {
            System.out.println("a字串 = b字串");
        } else if (d > 0) {
            System.out.println("a字串 > b字串");
        } else if (d < 0) {
            System.out.println("a字串 < b字串");
        }
         */
        //String a = "Hello, Java!";
        // 指定位置的內容 => charAt();
        //System.out.println(a.substring(7, 11));  //單一或多字
        //System.out.println(a.charAt(7));        //單一字
        // 指定字元第一次出現的位置 => indexOf(字元或字串) 
        //System.out.println(a.indexOf('a'));
        /*
        if (a.indexOf('a') < 0) {
            System.out.println("not found!");
        }else{
            System.out.println("a第一次出現的位置:"+a.indexOf('a'));
        }
         */
        // 找到指定的字，取代成新的字  => replace(原值, 新值)
        //System.out.println(a.replace("Hello", "Hi"));
        // 指定的數值轉成字串 => valueOf(int x)
        /*
        int a = 5;
        int b = 3;
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "+" + b + "=" + a + b);
        System.out.println(a + "+" + b + "=" + String.valueOf(a) + String.valueOf(b));
         */
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
