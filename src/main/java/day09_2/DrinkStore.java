package day09_2;

import java.util.ArrayList;

public class DrinkStore {
    // 商品集合
    private ArrayList<Product> products = new ArrayList<>();
    
    public DrinkStore() {
        // 預設商品
        Drink tea      = new Drink(250, "Tea", 20);
        Drink milk     = new Drink(500, "Milk", 50);
        Drink coffee   = new Drink(400, "Coffee", 70);
        Dessert cake   = new Dessert("S", "Cake", 35);
        Dessert cookie = new Dessert("L", "Cookie", 15);
        // 加入到商品集合中
        products.add(tea);
        products.add(milk);
        products.add(coffee);
        products.add(cake);
        products.add(cookie);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public void print() {
        System.out.println("+---------+------+----------+---------+-------+");
        System.out.println("|  Type   | Size | Capacity |   Name  | Price |");
        System.out.println("+---------+------+----------+---------+-------+");
        
        for (Product product : products) {
            String size = "";
            String capacity = "";
            switch(product.getClass().getSimpleName()) {
                case "Drink":
                    capacity = ((Drink)product).getCapacity() + "";
                    break;
                case "Dessert":
                    size = ((Dessert)product).getSize();
                    break;
            }
            System.out.printf("| %-7s | %4s | %-8s | %-7s | %5s |\n", 
                              product.getClass().getSimpleName(),
                              size,
                              capacity,
                              product.getName(),
                              product.getPrice());
            System.out.println("+---------+------+----------+---------+-------+");
        }
    }
    
    @Override
    public String toString() {
        return "DrinkStore{" + "products=" + products + '}';
    }
    
    
}
