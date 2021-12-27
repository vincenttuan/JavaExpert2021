package day08;

public class BMITest3 {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name = "John";
        b1.h = 170;
        b1.w = 60;
        b1.setBMI();
        b1.print();
        
        BMI b2 = new BMI();
        b2.name = "Mary";
        b2.h = 160.5;
        b2.w = 42.0;
        b2.setBMI();
        b2.print();
        
        // 分析 I
        System.out.println("分析...");
        BMI[] bmis = {b1, b2};
        for(BMI bmi : bmis) { // for-in(each)
            System.out.printf("%s BMI: %.2f\n", bmi.name, bmi.bmi); 
        }
        
        // 分析 II
        for(int i=0;i<bmis.length;i++) {
            //BMI bmi = bmis[i];
            //System.out.printf("%s BMI: %.2f\n", bmi.name, bmi.bmi);
            System.out.printf("%s BMI: %.2f\n", bmis[i].name, bmis[i].bmi);
        }        
    }
}
