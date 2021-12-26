package day04;

public class ex45 {

    public static void main(String[] args) {
        // 二分搜尋法
        int a[] = {12, 17, 21, 23, 46, 55};
        int sNo = 33;

        // 第一次尋找
        int intL = 0;                   //最左邊位置
        int intR = a.length - 1;        //最右邊位置
        int intM = (intL + intR) / 2;   //中間位置(無條件捨去小數位)
        boolean found = false;
        while (true) {
            if (sNo == a[intM]) {
                //找到了
                System.out.println(sNo + "在第" + (intM + 1) + "數字");
                found = true;
                //結束
                break;
            } else {
                if (sNo > a[intM]) {
                    intL = intM + 1;            //中間值的位置+1（當尋找值大於中間值時）
                    intR = a.length - 1;
                } else {
                    intL = 0;
                    intR = intM - 1;            //中間值的位置-1（當尋找值小於中間值時）
                }
                intM = (intL + intR) / 2;           //重新找中間位置(無條件捨去小數位)
            }
        }
        if (found == false) {
            System.out.println("not found!");
        }
    }
}
