package day09_2;

public class DrinkStoreSystem {
    
    private static boolean stop = false; // 是否停止 ?
    
    public static void menu() {
        
    }
    
    public static void main(String[] args) {
        System.out.println("程式開始...");
        while (!stop) {            
            menu();
        }
        System.out.println("程式停止...");
    }
    
}
