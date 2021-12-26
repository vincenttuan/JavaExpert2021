package day07;

import java.util.ArrayList;

public class ex73 {

    public static void main(String[] args) {
        // 資料結構

        // ArrayList類別
        /*
            1. 可儲存不同類型的資料
            2. 儲存容量不用事先規定，會隨著資料而自動增加
         */
        ArrayList a = new ArrayList();
        //寫入資料:add()
        a.add(3);               // position => 0
        a.add("Java");          // position => 1
        a.add(3.14);            // position => 2
        a.add("程式");          // position => 3
        System.out.println(a);

        //插入資料到指定的位置
        //add(指定位置, 值)
        a.add(1, 5);
        System.out.println(a);

        //檢查資料是否存在 => contains(值) => 回傳值是布林值(true:有找到 / false:找不到)
        System.out.println(a.contains(3.14));

        //取得資料的位置 => indexOf(值) => 找到(得到資料的位置)，找不到(-1)
        System.out.println(a.indexOf("Java"));

        //取得指定位置的內容 => get(索引值index)
        System.out.println("第4個位置的內容:" + a.get(4));
        System.out.printf("第3個位置的內容:%.2f\n", a.get(3));
        System.out.printf("第1個位置的內容:%d\n", a.get(1));
        System.out.printf("第2個位置的內容:%s\n", a.get(2));

        //ArrayList串列的長度 => size()
        System.out.println("串列的長度:" + a.size());
        
        //刪除串列中被指定的值 => remove(索引值index)
        a.remove(4);
        System.out.println(a);
        
        //刪除串列中被指定的值 => remove(元素資料)
        a.remove("程式");
        System.out.println(a);
    }

}
