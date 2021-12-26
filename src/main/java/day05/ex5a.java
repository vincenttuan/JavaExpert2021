package day05;

public class ex5a {
    // 沒有 static => 物件成員，使用時要用物件取用
    //   有 static => 類別成員，可以直接取用

    private double radius;
    public void setRadius(double r) {
        this.radius = r;
    }
    public double getArea() {
        return area(this.radius);
    }
    public static double area(double r) {
        return r * r * Math.PI;
    }
    public static void main(String[] args) {
        // 有 static
        System.out.println("半徑10的圓面積(有 static)=" + area(10));
        // 沒有 static
        System.out.println("-----------------------");
        ex5a circle1 = new ex5a();
        circle1.setRadius(10);
        System.out.println("半徑10的圓面積(沒有 static)=" + circle1.getArea());
    }

}
