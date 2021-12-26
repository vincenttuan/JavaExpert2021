package day04;

public class ex43 {

    public static void main(String[] args) {
        // 二維陣列
        //int a[][] = new int[5][3];
        int a[][] = {
            {50, 60, 70},
            {30, 40, 50},
            {70, 80, 90},
            {66, 77, 88},
            {22, 33, 66}
        };
        //System.out.println(a[1][2]);    //第1列,第2行

        // 每人的平均與總分
        // 每人的不及格科數
        // 各科平均分數
        /*
            座號    國文    英文    數學    總分    平均    不及格科數
             1       50      60      70      180     60.0       1
             2       30      40      50      120     40.0       3
             ~
             5       22      33      66      121     40.3       2
            ----------------------------------------------------------
            平均    47.6     58.0      72.8
         */
        System.out.printf("座號\t國文\t英文\t數學\t總分\t平均\t不及格科數\n");
        int failCount = 0;      //不及格科數
        int totC = 0, totE = 0, totM = 0;            //各科合計(國,英,數)        

        //控制列數(第幾個學生)
        for (int i = 0; i <= 4; i++) {
            //輸出陣列中的資料
            System.out.print(i + 1);
            //控制行(欄)數(第幾個學生的分數)
            //System.out.printf("\t%d\t%d\t%d", a[i][0],a[i][1],a[i][2]);

            System.out.print('\t');
            System.out.print(a[i][0]);  //國文
            //國文是否及格
            if (a[i][0] < 60) {
                failCount++;
            }
            totC += a[i][0];  //國文累計

            System.out.print('\t');
            System.out.print(a[i][1]);  //英文
            if (a[i][1] < 60) {
                failCount++;
            }
            totE += a[i][1];  //英文累計
            System.out.print('\t');

            System.out.print(a[i][2]);  //數學
            if (a[i][2] < 60) {
                failCount++;
            }
            totM += a[i][2];  //數學累計

            System.out.print('\t');
            System.out.print(a[i][0] + a[i][1] + a[i][2]);  //總分
            System.out.print('\t');
            System.out.printf("%.1f", (double) (a[i][0] + a[i][1] + a[i][2]) / 3);  //平均
            System.out.print('\t');
            System.out.print(failCount);  //不及格科數
            System.out.println();

            failCount = 0;  // 不及格科數值歸零
        }
        System.out.println("----------------------------------------------------------");
        System.out.print("平均");
        System.out.print("\t");
        System.out.printf("%.1f", (double) totC / 5);
        System.out.print("\t");
        System.out.printf("%.1f", (double) totE / 5);
        System.out.print("\t");
        System.out.printf("%.1f", (double) totM / 5);
        System.out.println();
    }

}
