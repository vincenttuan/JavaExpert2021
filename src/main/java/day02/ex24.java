package day02;

public class ex24 {

    public static void main(String[] args) {
        // TODO code application logic here
        // switch -- case        
        /*
            switch([變數], [運算式], [物件]){ 
                case 值1：
                    程式敘述
                    ...
                    break;  //不是一定要寫，大多時候會寫
                case 值2：
                    程式敘述
                    ...
                    break;  //不是一定要寫，大多時候會寫
        。。。
                case 值N：
                    程式敘述
                    ...
                    break;  //不是一定要寫，大多時候會寫
                default:
                    //以上皆非
            }
         */

        // 輸入星期別代號，輸出星期幾
        int a = 1;
        switch(a){
            case 1:
                System.out.println(a + "的代號是星期1");
                break;
            case 2:
                System.out.println(a + "的代號是星期2");                
                break;
            case 3:
                System.out.println(a + "的代號是星期3");
                break;
            case 4:
                System.out.println(a + "的代號是星期4");
                break;
            case 5:
                System.out.println(a + "的代號是星期5");
                break;
            case 6:
                System.out.println(a + "的代號是星期6");
                break;
            case 7:
                System.out.println(a + "的代號是星期天");
                break;
            default:
                //以上條件都不存在
                System.out.println(a + "的星期代號不存在(1-7)");
                break;
        }

        
//        if (a == 1) {
//            System.out.println("星期一");
//        } else if (a == 2) {
//            System.out.println("星期二");
//        } else if (a == 3) {
//            System.out.println("星期三");
//        } else if (a == 4) {
//            System.out.println("星期四");
//        } else if (a == 5) {
//            System.out.println("星期五");
//        } else if (a == 6) {
//            System.out.println("星期六");
//        } else if (a == 7) {
//            System.out.println("星期日");
//        } else {
//            //以上條件都不存在
//            System.out.println(a + "的星期代號不存在(1-7)");
//        }

    }

}
