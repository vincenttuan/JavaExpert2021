package day08;

// 類別名稱「字首」一律大寫
public class BMITest {
    public static void main(String[] args) {
        // John, 170,   60   求 bmi = ?
        // Mary, 160.5, 42.0 求 bmi = ?
        
        String name1 = "John";
        double h1 = 170;
        double w1 = 60;
        double bmi = w1 / Math.pow(h1/100, 2);
        System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI: %.2f\n", 
                          name1, h1, w1, bmi);
        
        String name2 = "Mary";
        double h2 = 160.5;
        double w2 = 42.0;
        double bmi2 = w2 / Math.pow(h2/100, 2);
        System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI: %.2f\n", 
                          name2, h2, w2, bmi2);
        
    }
}
