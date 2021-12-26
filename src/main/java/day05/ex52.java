package day05;

import java.util.ArrayList;

public class ex52 {

    public static void main(String[] args) {
        // 使用ArrayList
        ArrayList myList = new ArrayList();
        
        // 增加成員
        myList.add("s1");
        myList.add("s2");
        myList.add("s3");
        myList.add("s4");
        // 輸出ArrayList內容
        System.out.println(myList);
        System.out.println("-----------------------");
        // 移除第一個成員
        myList.remove(0);
        System.out.println(myList);
        // 移除最後一個成員
        myList.remove(myList.size()-1);
        System.out.println("-----------------------");
        System.out.println(myList);
        // 移除指定成員
        myList.remove("s3");
        System.out.println("-----------------------");
        System.out.println(myList);
        System.out.println("-----------------------");
        System.out.println("成員數：" + myList.size());
    }

}
