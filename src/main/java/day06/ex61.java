package day06;

public class ex61 {

    public static void main(String[] args) {
        // char c1='A';
        // String類別：不可改變長度(immutable)
        // StringBuilder類別：可改變長度(mutable)

        /*
        String name1 = "Java";
        System.out.println("name1=" + name1);
        String name2 = "Hello " + name1;
        System.out.println("name2=" + name2);
        // concat() => 字串相連
        String name3 = name1.concat(" Hello!");
        System.out.println("name3=" + name3);
         */
        String str1 = "Hello Java ";
        // length() => 取得字串的長度
        int strLength = str1.length();
        System.out.println("長度：" + strLength);
        // trim() => 去除字串前後空白
        str1 = str1.trim();
        //str1.trim();
        System.out.println(str1.length());
        //substring() => 取出字串中部分的字
        System.out.println(str1 + "中的第4個字：" + str1.substring(3, 4));
        System.out.println(str1 + "中的第4-8個字：" + str1.substring(3, 8));
        str1 = str1.substring(3);
        System.out.println(str1 + "中的第4個字之後的全部：" + str1);
        System.out.println(str1 + "中的第4個字之前的全部：" + str1.substring(0, 3));
        //toUpperCase() => 小寫轉大寫
        System.out.println(str1 + "大寫：" + str1.toUpperCase());
        //toLowerCase() => 大寫轉小寫
        System.out.println(str1 + "小寫：" + str1.toLowerCase());
        //endsWith() => 判斷字串結尾的內容 => 回傳布林值
        boolean end = str1.endsWith("Java");
        System.out.println(end);

    }

}
