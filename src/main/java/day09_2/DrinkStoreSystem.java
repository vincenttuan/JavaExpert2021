package day09_2;

import java.util.Scanner;

public class DrinkStoreSystem {

    private static boolean stop = false; // 是否停止 ?
    private static DrinkStore ds = new DrinkStore();

    public static void menu() {
        System.out.println("\n系統選單");
        System.out.println("-------------------");
        System.out.println("1. 新增 Dessert 商品");
        System.out.println("2. 新增 Drink 商品");
        System.out.println("3. 修改 Dessert 價格");
        System.out.println("4. 修改 Drink 價格");
        System.out.println("5. 刪除 Dessert 商品");
        System.out.println("6. 刪除 Drink 商品");
        System.out.println("7. 列印/查詢所有商品");
        System.out.println("0. 離開系統");
        System.out.println("-------------------");
        System.out.println("請選擇 ==> ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addDessert();
                break;
            case 2:
                addDrink();
                break;    
            case 7:
                ds.print();
                break;
            case 0:
                stop = true;
                break;
        }
    }

    private static void addDessert() {
        System.out.println("新增 Desert 請依序輸入 size name price: ");
        System.out.println("範例：M Bread 30");
        Scanner sc = new Scanner(System.in);
        String size = sc.next();
        String name = sc.next();
        Integer price = sc.nextInt();
        Dessert dessert = new Dessert(size, name, price);
        ds.addProduct(dessert);
    }
    
    private static void addDrink() {
        System.out.println("新增 Drink 請依序輸入 capacity name price: ");
        System.out.println("範例：200 juice 65");
        Scanner sc = new Scanner(System.in);
        Integer capacity = sc.nextInt();
        String name = sc.next();
        Integer price = sc.nextInt();
        Drink drink = new Drink(capacity, name, price);
        ds.addProduct(drink);
    }

    public static void main(String[] args) {
        System.out.println("程式開始...");
        while (!stop) {
            menu();
        }
        System.out.println("程式停止...");
    }

}
