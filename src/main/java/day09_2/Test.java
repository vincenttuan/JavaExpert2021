package day09_2;

public class Test {
    public static void main(String[] args) {
        DrinkStore ds = new DrinkStore();
        
        // 建立一個 Drink 
        Drink redTea = new Drink(200, "Red tea", 10);
        ds.addProduct(redTea);
        
        // 想要修改 Cookie 的價格由 15 -> 25
        // 1. 先取得 name=Cookie 的 Dessert 物件
        // 2. 修改價格
        ds.print();
        
    }
}
