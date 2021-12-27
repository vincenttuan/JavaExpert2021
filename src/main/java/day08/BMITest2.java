package day08;

public class BMITest2 {
    // 主方法
    public static void main(String[] args) {
        String name1 = "John";
        double h1 = 170, w1 = 60;
        double bmi1 = getBMI(h1, w1);
        print(name1, h1, w1, bmi1);
        
        String name2 = "Mary";
        double h2 = 160.5, w2 = 42.0;
        double bmi2 = getBMI(h2, w2);
        print(name2, h2, w2, bmi2);
    }
    
    // 計算 bmi 的方法
    private static double getBMI(double h, double w) {
        double bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
    
    // 列印 bmi 相關資訊的方法
    private static void print(String name, double h, double w, double bmi) {
        System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI: %.2f\n",
                          name, h, w, bmi);
    }
}
