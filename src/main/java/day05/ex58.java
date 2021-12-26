package day05;

public class ex58 {

    // 二個 int 參數
    static int add(int n1, int n2) {
        return n1 + n2;
    }
    // 三個 int 參數
    static int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    // 二個 int 參數 + 一個 double 參數    
    static double add(int n1, int n2, double n3) {
        return n1 + n2 + n3;
    }
    
    public static void main(String[] args) {
        // 多型 (Polymorphism):多載(Overloading)與改寫(Overriding)
        int a = 2, b = 3, c = 5;
        double d = 5.2;
        int i, j;
        double k;

        // add 方法的多載示範
        i = add(a, b);  // int + int
        System.out.println(i);

        j = add(a, b, c);  // int + int + int
        System.out.println(j);

        k = add(a, b, d);  // int + int + double
        System.out.println(k);
    }

}
