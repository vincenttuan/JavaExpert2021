package day05;

public class ex59 {

    private double radius;          //private => 私有權限被保護
    static final double PI = 3.1415926;    //final=> 執行中不能改變值

    // 接收半徑
    public void setRadius(double r) {
        this.radius = r;
    }

    // 計算面積
    public double getArea() {
        return this.radius * this.radius * PI;
    }
    
    // 計算面積2
    public static double area(double r){
        return r * r * PI;        
    }    

    public static void main(String[] args) {
        // 沒有 static 的作法
        // 圓面積 = 圓周率 * 半徑 * 半徑
        // 建立一個 ex59:c1 的物件，半徑為1，並取得圓面積
        ex59 c1 = new ex59();
        c1.setRadius(1);
        System.out.println(c1.getArea());

        // 建立一個 ex59:c2 的物件，半徑為1，並取得圓面積
        ex59 c2 = new ex59();
        c2.setRadius(10);
        System.out.println(c2.getArea());        
        // --------------------------------------------------        
        // 有 static 的作法
        // 呼叫圓周率
        System.out.println(PI);    
        System.out.println(ex59.PI);
        // 半徑為1，求圓面積  
        System.out.println(area(1));
        System.out.println(ex59.area(1));
        // 半徑為10，求圓面積
        System.out.println(area(10));
        System.out.println(ex59.area(10));
    }

}
