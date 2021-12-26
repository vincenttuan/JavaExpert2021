package day06;

public class ex62 {

    public static void main(String[] args) {
        // StringBuilder類別：可改變長度(mutable)
        /*
            1. 必須使用「new」識別字(關鍵字)進行物件的實例化才可以使用
            2. 字串變更長度常用的方法：
                => append():新增
                => insert():插入
                => delete():刪除
         */

 /*
        StringBuilder sb1 = new StringBuilder(8);
        System.out.println("sb1-1:" + sb1);
        sb1.append("Hi,");
        System.out.println("sb1-2:" + sb1);
        sb1.append(" ");
        System.out.println("sb1-3:" + sb1);
        sb1.append("Java! ");
        System.out.println("sb1-4:" + sb1);
        System.out.println("sb1-5:" + sb1.length());
         */
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0912345678");
        System.out.println("sb2-1:" + sb2);
        //0912-345-678
        sb2.insert(4, "-");
        //System.out.println("sb2-2:" + sb2);
        sb2.insert(8, "-");
        sb2.append("-");
        System.out.println("sb2-3:" + sb2);
        System.out.println(sb2.length());
        //System.out.println(sb2.substring(sb2.length() - 1));
        sb2.delete(sb2.length() - 1, sb2.length());
        System.out.println("sb2-4:" + sb2);
        System.out.println(sb2.length());
    }

}
