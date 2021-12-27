package day08;

// 設計一個 BMI 物件
public class BMI {
    String name; // 存放姓名
    double h;    // 存放身高
    double w;    // 存放體重
    double bmi;  // 存放BMI資料
    
    // 計算/設定 bmi
    void setBMI() {
        bmi = w / Math.pow(h/100, 2);
    }
    
    // 印出資料
    void print() {
        System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI: %.2f\n",
                          name, h, w, bmi);
    }
}
