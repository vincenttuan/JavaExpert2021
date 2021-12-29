package day09_2;

public class Test {
    public static void main(String[] args) {
        DrinkStore ds = new DrinkStore();
        
        // 建立一個 Drink 
        Drink redTea = new Drink(200, "Red tea", 10);
        ds.addProduct(redTea);
        
        ds.print();
        
    }
}
