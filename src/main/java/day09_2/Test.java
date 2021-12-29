package day09_2;

public class Test {
    public static void main(String[] args) {
        DrinkStore ds = new DrinkStore();
        
        // 建立一個 Drink 
        Drink redTea = new Drink(200, "Red tea", 10);
        ds.addProduct(redTea);
        ds.print();
        
        // 想要修改 Cookie 的價格由 15 -> 25 (Part I)
        // 1. 先取得 name=Cookie 的 Dessert 物件
        Dessert dessert = ds.getDessertByName("Cookie");
        // 2. 修改價格
        if(dessert != null) {
            dessert.setPrice(25);
            ds.print();
        } else {
            System.out.println("無此商品");
        }
        
        // 想要修改 Cookie 的價格由 25 -> 35 (Part II)
        //ds.updateDessertPriceByName("Cookie", 35);
        
        
    }
}
